/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import entities.Clientes;
import entities.Facturas;
import entities.TarjetasBancarias;
import entities.exceptions.IllegalOrphanException;
import entities.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Jose Angel
 */
public class ClientesJpaController implements Serializable {

    public ClientesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Clientes clientes) {
        if (clientes.getFacturasList() == null) {
            clientes.setFacturasList(new ArrayList<Facturas>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TarjetasBancarias idtarjetaBancaria = clientes.getIdtarjetaBancaria();
            if (idtarjetaBancaria != null) {
                idtarjetaBancaria = em.getReference(idtarjetaBancaria.getClass(), idtarjetaBancaria.getIdtarjetaBancaria());
                clientes.setIdtarjetaBancaria(idtarjetaBancaria);
            }
            List<Facturas> attachedFacturasList = new ArrayList<Facturas>();
            for (Facturas facturasListFacturasToAttach : clientes.getFacturasList()) {
                facturasListFacturasToAttach = em.getReference(facturasListFacturasToAttach.getClass(), facturasListFacturasToAttach.getFacturasPK());
                attachedFacturasList.add(facturasListFacturasToAttach);
            }
            clientes.setFacturasList(attachedFacturasList);
            em.persist(clientes);
            if (idtarjetaBancaria != null) {
                idtarjetaBancaria.getClientesList().add(clientes);
                idtarjetaBancaria = em.merge(idtarjetaBancaria);
            }
            for (Facturas facturasListFacturas : clientes.getFacturasList()) {
                Clientes oldClientesOfFacturasListFacturas = facturasListFacturas.getClientes();
                facturasListFacturas.setClientes(clientes);
                facturasListFacturas = em.merge(facturasListFacturas);
                if (oldClientesOfFacturasListFacturas != null) {
                    oldClientesOfFacturasListFacturas.getFacturasList().remove(facturasListFacturas);
                    oldClientesOfFacturasListFacturas = em.merge(oldClientesOfFacturasListFacturas);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Clientes clientes) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Clientes persistentClientes = em.find(Clientes.class, clientes.getIdCliente());
            TarjetasBancarias idtarjetaBancariaOld = persistentClientes.getIdtarjetaBancaria();
            TarjetasBancarias idtarjetaBancariaNew = clientes.getIdtarjetaBancaria();
            List<Facturas> facturasListOld = persistentClientes.getFacturasList();
            List<Facturas> facturasListNew = clientes.getFacturasList();
            List<String> illegalOrphanMessages = null;
            for (Facturas facturasListOldFacturas : facturasListOld) {
                if (!facturasListNew.contains(facturasListOldFacturas)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Facturas " + facturasListOldFacturas + " since its clientes field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (idtarjetaBancariaNew != null) {
                idtarjetaBancariaNew = em.getReference(idtarjetaBancariaNew.getClass(), idtarjetaBancariaNew.getIdtarjetaBancaria());
                clientes.setIdtarjetaBancaria(idtarjetaBancariaNew);
            }
            List<Facturas> attachedFacturasListNew = new ArrayList<Facturas>();
            for (Facturas facturasListNewFacturasToAttach : facturasListNew) {
                facturasListNewFacturasToAttach = em.getReference(facturasListNewFacturasToAttach.getClass(), facturasListNewFacturasToAttach.getFacturasPK());
                attachedFacturasListNew.add(facturasListNewFacturasToAttach);
            }
            facturasListNew = attachedFacturasListNew;
            clientes.setFacturasList(facturasListNew);
            clientes = em.merge(clientes);
            if (idtarjetaBancariaOld != null && !idtarjetaBancariaOld.equals(idtarjetaBancariaNew)) {
                idtarjetaBancariaOld.getClientesList().remove(clientes);
                idtarjetaBancariaOld = em.merge(idtarjetaBancariaOld);
            }
            if (idtarjetaBancariaNew != null && !idtarjetaBancariaNew.equals(idtarjetaBancariaOld)) {
                idtarjetaBancariaNew.getClientesList().add(clientes);
                idtarjetaBancariaNew = em.merge(idtarjetaBancariaNew);
            }
            for (Facturas facturasListNewFacturas : facturasListNew) {
                if (!facturasListOld.contains(facturasListNewFacturas)) {
                    Clientes oldClientesOfFacturasListNewFacturas = facturasListNewFacturas.getClientes();
                    facturasListNewFacturas.setClientes(clientes);
                    facturasListNewFacturas = em.merge(facturasListNewFacturas);
                    if (oldClientesOfFacturasListNewFacturas != null && !oldClientesOfFacturasListNewFacturas.equals(clientes)) {
                        oldClientesOfFacturasListNewFacturas.getFacturasList().remove(facturasListNewFacturas);
                        oldClientesOfFacturasListNewFacturas = em.merge(oldClientesOfFacturasListNewFacturas);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = clientes.getIdCliente();
                if (findClientes(id) == null) {
                    throw new NonexistentEntityException("The clientes with id " + id + " no longer exists.");
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
            Clientes clientes;
            try {
                clientes = em.getReference(Clientes.class, id);
                clientes.getIdCliente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The clientes with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Facturas> facturasListOrphanCheck = clientes.getFacturasList();
            for (Facturas facturasListOrphanCheckFacturas : facturasListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Clientes (" + clientes + ") cannot be destroyed since the Facturas " + facturasListOrphanCheckFacturas + " in its facturasList field has a non-nullable clientes field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            TarjetasBancarias idtarjetaBancaria = clientes.getIdtarjetaBancaria();
            if (idtarjetaBancaria != null) {
                idtarjetaBancaria.getClientesList().remove(clientes);
                idtarjetaBancaria = em.merge(idtarjetaBancaria);
            }
            em.remove(clientes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Clientes> findClientesEntities() {
        return findClientesEntities(true, -1, -1);
    }

    public List<Clientes> findClientesEntities(int maxResults, int firstResult) {
        return findClientesEntities(false, maxResults, firstResult);
    }

    private List<Clientes> findClientesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Clientes.class));
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

    public Clientes findClientes(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Clientes.class, id);
        } finally {
            em.close();
        }
    }

    public int getClientesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Clientes> rt = cq.from(Clientes.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
