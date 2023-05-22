/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import entities.Clientes;
import entities.TarjetasBancarias;
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
public class TarjetasBancariasJpaController implements Serializable {

    public TarjetasBancariasJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TarjetasBancarias tarjetasBancarias) {
        if (tarjetasBancarias.getClientesList() == null) {
            tarjetasBancarias.setClientesList(new ArrayList<Clientes>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Clientes> attachedClientesList = new ArrayList<Clientes>();
            for (Clientes clientesListClientesToAttach : tarjetasBancarias.getClientesList()) {
                clientesListClientesToAttach = em.getReference(clientesListClientesToAttach.getClass(), clientesListClientesToAttach.getIdCliente());
                attachedClientesList.add(clientesListClientesToAttach);
            }
            tarjetasBancarias.setClientesList(attachedClientesList);
            em.persist(tarjetasBancarias);
            for (Clientes clientesListClientes : tarjetasBancarias.getClientesList()) {
                TarjetasBancarias oldIdtarjetaBancariaOfClientesListClientes = clientesListClientes.getIdtarjetaBancaria();
                clientesListClientes.setIdtarjetaBancaria(tarjetasBancarias);
                clientesListClientes = em.merge(clientesListClientes);
                if (oldIdtarjetaBancariaOfClientesListClientes != null) {
                    oldIdtarjetaBancariaOfClientesListClientes.getClientesList().remove(clientesListClientes);
                    oldIdtarjetaBancariaOfClientesListClientes = em.merge(oldIdtarjetaBancariaOfClientesListClientes);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TarjetasBancarias tarjetasBancarias) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TarjetasBancarias persistentTarjetasBancarias = em.find(TarjetasBancarias.class, tarjetasBancarias.getIdtarjetaBancaria());
            List<Clientes> clientesListOld = persistentTarjetasBancarias.getClientesList();
            List<Clientes> clientesListNew = tarjetasBancarias.getClientesList();
            List<Clientes> attachedClientesListNew = new ArrayList<Clientes>();
            for (Clientes clientesListNewClientesToAttach : clientesListNew) {
                clientesListNewClientesToAttach = em.getReference(clientesListNewClientesToAttach.getClass(), clientesListNewClientesToAttach.getIdCliente());
                attachedClientesListNew.add(clientesListNewClientesToAttach);
            }
            clientesListNew = attachedClientesListNew;
            tarjetasBancarias.setClientesList(clientesListNew);
            tarjetasBancarias = em.merge(tarjetasBancarias);
            for (Clientes clientesListOldClientes : clientesListOld) {
                if (!clientesListNew.contains(clientesListOldClientes)) {
                    clientesListOldClientes.setIdtarjetaBancaria(null);
                    clientesListOldClientes = em.merge(clientesListOldClientes);
                }
            }
            for (Clientes clientesListNewClientes : clientesListNew) {
                if (!clientesListOld.contains(clientesListNewClientes)) {
                    TarjetasBancarias oldIdtarjetaBancariaOfClientesListNewClientes = clientesListNewClientes.getIdtarjetaBancaria();
                    clientesListNewClientes.setIdtarjetaBancaria(tarjetasBancarias);
                    clientesListNewClientes = em.merge(clientesListNewClientes);
                    if (oldIdtarjetaBancariaOfClientesListNewClientes != null && !oldIdtarjetaBancariaOfClientesListNewClientes.equals(tarjetasBancarias)) {
                        oldIdtarjetaBancariaOfClientesListNewClientes.getClientesList().remove(clientesListNewClientes);
                        oldIdtarjetaBancariaOfClientesListNewClientes = em.merge(oldIdtarjetaBancariaOfClientesListNewClientes);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tarjetasBancarias.getIdtarjetaBancaria();
                if (findTarjetasBancarias(id) == null) {
                    throw new NonexistentEntityException("The tarjetasBancarias with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TarjetasBancarias tarjetasBancarias;
            try {
                tarjetasBancarias = em.getReference(TarjetasBancarias.class, id);
                tarjetasBancarias.getIdtarjetaBancaria();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tarjetasBancarias with id " + id + " no longer exists.", enfe);
            }
            List<Clientes> clientesList = tarjetasBancarias.getClientesList();
            for (Clientes clientesListClientes : clientesList) {
                clientesListClientes.setIdtarjetaBancaria(null);
                clientesListClientes = em.merge(clientesListClientes);
            }
            em.remove(tarjetasBancarias);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TarjetasBancarias> findTarjetasBancariasEntities() {
        return findTarjetasBancariasEntities(true, -1, -1);
    }

    public List<TarjetasBancarias> findTarjetasBancariasEntities(int maxResults, int firstResult) {
        return findTarjetasBancariasEntities(false, maxResults, firstResult);
    }

    private List<TarjetasBancarias> findTarjetasBancariasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TarjetasBancarias.class));
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

    public TarjetasBancarias findTarjetasBancarias(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TarjetasBancarias.class, id);
        } finally {
            em.close();
        }
    }

    public int getTarjetasBancariasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TarjetasBancarias> rt = cq.from(TarjetasBancarias.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
