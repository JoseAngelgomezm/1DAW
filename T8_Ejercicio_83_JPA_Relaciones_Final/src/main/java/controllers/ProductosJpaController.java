/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import controllers.exceptions.IllegalOrphanException;
import controllers.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entities.Proveedores;
import entities.Facturas;
import entities.Productos;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author joseangel
 */
public class ProductosJpaController implements Serializable {

    public ProductosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Productos productos) {
        if (productos.getFacturasList() == null) {
            productos.setFacturasList(new ArrayList<Facturas>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Proveedores idProveedor = productos.getIdProveedor();
            if (idProveedor != null) {
                idProveedor = em.getReference(idProveedor.getClass(), idProveedor.getIdProveedor());
                productos.setIdProveedor(idProveedor);
            }
            List<Facturas> attachedFacturasList = new ArrayList<Facturas>();
            for (Facturas facturasListFacturasToAttach : productos.getFacturasList()) {
                facturasListFacturasToAttach = em.getReference(facturasListFacturasToAttach.getClass(), facturasListFacturasToAttach.getFacturasPK());
                attachedFacturasList.add(facturasListFacturasToAttach);
            }
            productos.setFacturasList(attachedFacturasList);
            em.persist(productos);
            if (idProveedor != null) {
                idProveedor.getProductosList().add(productos);
                idProveedor = em.merge(idProveedor);
            }
            for (Facturas facturasListFacturas : productos.getFacturasList()) {
                Productos oldProductosOfFacturasListFacturas = facturasListFacturas.getProductos();
                facturasListFacturas.setProductos(productos);
                facturasListFacturas = em.merge(facturasListFacturas);
                if (oldProductosOfFacturasListFacturas != null) {
                    oldProductosOfFacturasListFacturas.getFacturasList().remove(facturasListFacturas);
                    oldProductosOfFacturasListFacturas = em.merge(oldProductosOfFacturasListFacturas);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Productos productos) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Productos persistentProductos = em.find(Productos.class, productos.getIdProducto());
            Proveedores idProveedorOld = persistentProductos.getIdProveedor();
            Proveedores idProveedorNew = productos.getIdProveedor();
            List<Facturas> facturasListOld = persistentProductos.getFacturasList();
            List<Facturas> facturasListNew = productos.getFacturasList();
            List<String> illegalOrphanMessages = null;
            for (Facturas facturasListOldFacturas : facturasListOld) {
                if (!facturasListNew.contains(facturasListOldFacturas)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Facturas " + facturasListOldFacturas + " since its productos field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (idProveedorNew != null) {
                idProveedorNew = em.getReference(idProveedorNew.getClass(), idProveedorNew.getIdProveedor());
                productos.setIdProveedor(idProveedorNew);
            }
            List<Facturas> attachedFacturasListNew = new ArrayList<Facturas>();
            for (Facturas facturasListNewFacturasToAttach : facturasListNew) {
                facturasListNewFacturasToAttach = em.getReference(facturasListNewFacturasToAttach.getClass(), facturasListNewFacturasToAttach.getFacturasPK());
                attachedFacturasListNew.add(facturasListNewFacturasToAttach);
            }
            facturasListNew = attachedFacturasListNew;
            productos.setFacturasList(facturasListNew);
            productos = em.merge(productos);
            if (idProveedorOld != null && !idProveedorOld.equals(idProveedorNew)) {
                idProveedorOld.getProductosList().remove(productos);
                idProveedorOld = em.merge(idProveedorOld);
            }
            if (idProveedorNew != null && !idProveedorNew.equals(idProveedorOld)) {
                idProveedorNew.getProductosList().add(productos);
                idProveedorNew = em.merge(idProveedorNew);
            }
            for (Facturas facturasListNewFacturas : facturasListNew) {
                if (!facturasListOld.contains(facturasListNewFacturas)) {
                    Productos oldProductosOfFacturasListNewFacturas = facturasListNewFacturas.getProductos();
                    facturasListNewFacturas.setProductos(productos);
                    facturasListNewFacturas = em.merge(facturasListNewFacturas);
                    if (oldProductosOfFacturasListNewFacturas != null && !oldProductosOfFacturasListNewFacturas.equals(productos)) {
                        oldProductosOfFacturasListNewFacturas.getFacturasList().remove(facturasListNewFacturas);
                        oldProductosOfFacturasListNewFacturas = em.merge(oldProductosOfFacturasListNewFacturas);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = productos.getIdProducto();
                if (findProductos(id) == null) {
                    throw new NonexistentEntityException("The productos with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Productos productos;
            try {
                productos = em.getReference(Productos.class, id);
                productos.getIdProducto();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The productos with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Facturas> facturasListOrphanCheck = productos.getFacturasList();
            for (Facturas facturasListOrphanCheckFacturas : facturasListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Productos (" + productos + ") cannot be destroyed since the Facturas " + facturasListOrphanCheckFacturas + " in its facturasList field has a non-nullable productos field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Proveedores idProveedor = productos.getIdProveedor();
            if (idProveedor != null) {
                idProveedor.getProductosList().remove(productos);
                idProveedor = em.merge(idProveedor);
            }
            em.remove(productos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Productos> findProductosEntities() {
        return findProductosEntities(true, -1, -1);
    }

    public List<Productos> findProductosEntities(int maxResults, int firstResult) {
        return findProductosEntities(false, maxResults, firstResult);
    }

    private List<Productos> findProductosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Productos.class));
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

    public Productos findProductos(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Productos.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Productos> rt = cq.from(Productos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
