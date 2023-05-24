/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import controllers.exceptions.NonexistentEntityException;
import controllers.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entities.Clientes;
import entities.Facturas;
import entities.FacturasPK;
import entities.Productos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author joseangel
 */
public class FacturasJpaController implements Serializable {

    public FacturasJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Facturas facturas) throws PreexistingEntityException, Exception {
        if (facturas.getFacturasPK() == null) {
            facturas.setFacturasPK(new FacturasPK());
        }
        facturas.getFacturasPK().setIdCliente(facturas.getClientes().getIdCliente());
        facturas.getFacturasPK().setIdProducto(facturas.getProductos().getIdProducto());
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Clientes clientes = facturas.getClientes();
            if (clientes != null) {
                clientes = em.getReference(clientes.getClass(), clientes.getIdCliente());
                facturas.setClientes(clientes);
            }
            Productos productos = facturas.getProductos();
            if (productos != null) {
                productos = em.getReference(productos.getClass(), productos.getIdProducto());
                facturas.setProductos(productos);
            }
            em.persist(facturas);
            if (clientes != null) {
                clientes.getFacturasList().add(facturas);
                clientes = em.merge(clientes);
            }
            if (productos != null) {
                productos.getFacturasList().add(facturas);
                productos = em.merge(productos);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findFacturas(facturas.getFacturasPK()) != null) {
                throw new PreexistingEntityException("Facturas " + facturas + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Facturas facturas) throws NonexistentEntityException, Exception {
        facturas.getFacturasPK().setIdCliente(facturas.getClientes().getIdCliente());
        facturas.getFacturasPK().setIdProducto(facturas.getProductos().getIdProducto());
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Facturas persistentFacturas = em.find(Facturas.class, facturas.getFacturasPK());
            Clientes clientesOld = persistentFacturas.getClientes();
            Clientes clientesNew = facturas.getClientes();
            Productos productosOld = persistentFacturas.getProductos();
            Productos productosNew = facturas.getProductos();
            if (clientesNew != null) {
                clientesNew = em.getReference(clientesNew.getClass(), clientesNew.getIdCliente());
                facturas.setClientes(clientesNew);
            }
            if (productosNew != null) {
                productosNew = em.getReference(productosNew.getClass(), productosNew.getIdProducto());
                facturas.setProductos(productosNew);
            }
            facturas = em.merge(facturas);
            if (clientesOld != null && !clientesOld.equals(clientesNew)) {
                clientesOld.getFacturasList().remove(facturas);
                clientesOld = em.merge(clientesOld);
            }
            if (clientesNew != null && !clientesNew.equals(clientesOld)) {
                clientesNew.getFacturasList().add(facturas);
                clientesNew = em.merge(clientesNew);
            }
            if (productosOld != null && !productosOld.equals(productosNew)) {
                productosOld.getFacturasList().remove(facturas);
                productosOld = em.merge(productosOld);
            }
            if (productosNew != null && !productosNew.equals(productosOld)) {
                productosNew.getFacturasList().add(facturas);
                productosNew = em.merge(productosNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                FacturasPK id = facturas.getFacturasPK();
                if (findFacturas(id) == null) {
                    throw new NonexistentEntityException("The facturas with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(FacturasPK id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Facturas facturas;
            try {
                facturas = em.getReference(Facturas.class, id);
                facturas.getFacturasPK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The facturas with id " + id + " no longer exists.", enfe);
            }
            Clientes clientes = facturas.getClientes();
            if (clientes != null) {
                clientes.getFacturasList().remove(facturas);
                clientes = em.merge(clientes);
            }
            Productos productos = facturas.getProductos();
            if (productos != null) {
                productos.getFacturasList().remove(facturas);
                productos = em.merge(productos);
            }
            em.remove(facturas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Facturas> findFacturasEntities() {
        return findFacturasEntities(true, -1, -1);
    }

    public List<Facturas> findFacturasEntities(int maxResults, int firstResult) {
        return findFacturasEntities(false, maxResults, firstResult);
    }

    private List<Facturas> findFacturasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Facturas.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Facturas findFacturas(FacturasPK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Facturas.class, id);
        } finally {
            em.close();
        }
    }

    public int getFacturasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Facturas> rt = cq.from(Facturas.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
