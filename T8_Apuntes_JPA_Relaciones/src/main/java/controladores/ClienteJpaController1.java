/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import controladores.exceptions.IllegalOrphanException;
import controladores.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entidades.TarjetaBancaria;
import entidades.Alquiler;
import entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author joseangel
 */
public class ClienteJpaController1 implements Serializable {

    public ClienteJpaController1(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cliente cliente) {
        if (cliente.getAlquilerList() == null) {
            cliente.setAlquilerList(new ArrayList<Alquiler>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TarjetaBancaria tarjeta = cliente.getTarjeta();
            if (tarjeta != null) {
                tarjeta = em.getReference(tarjeta.getClass(), tarjeta.getId());
                cliente.setTarjeta(tarjeta);
            }
            List<Alquiler> attachedAlquilerList = new ArrayList<Alquiler>();
            for (Alquiler alquilerListAlquilerToAttach : cliente.getAlquilerList()) {
                alquilerListAlquilerToAttach = em.getReference(alquilerListAlquilerToAttach.getClass(), alquilerListAlquilerToAttach.getId());
                attachedAlquilerList.add(alquilerListAlquilerToAttach);
            }
            cliente.setAlquilerList(attachedAlquilerList);
            em.persist(cliente);
            if (tarjeta != null) {
                Cliente oldClienteOfTarjeta = tarjeta.getCliente();
                if (oldClienteOfTarjeta != null) {
                    oldClienteOfTarjeta.setTarjeta(null);
                    oldClienteOfTarjeta = em.merge(oldClienteOfTarjeta);
                }
                tarjeta.setCliente(cliente);
                tarjeta = em.merge(tarjeta);
            }
            for (Alquiler alquilerListAlquiler : cliente.getAlquilerList()) {
                Cliente oldClienteOfAlquilerListAlquiler = alquilerListAlquiler.getCliente();
                alquilerListAlquiler.setCliente(cliente);
                alquilerListAlquiler = em.merge(alquilerListAlquiler);
                if (oldClienteOfAlquilerListAlquiler != null) {
                    oldClienteOfAlquilerListAlquiler.getAlquilerList().remove(alquilerListAlquiler);
                    oldClienteOfAlquilerListAlquiler = em.merge(oldClienteOfAlquilerListAlquiler);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cliente cliente) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente persistentCliente = em.find(Cliente.class, cliente.getId());
            TarjetaBancaria tarjetaOld = persistentCliente.getTarjeta();
            TarjetaBancaria tarjetaNew = cliente.getTarjeta();
            List<Alquiler> alquilerListOld = persistentCliente.getAlquilerList();
            List<Alquiler> alquilerListNew = cliente.getAlquilerList();
            List<String> illegalOrphanMessages = null;
            for (Alquiler alquilerListOldAlquiler : alquilerListOld) {
                if (!alquilerListNew.contains(alquilerListOldAlquiler)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Alquiler " + alquilerListOldAlquiler + " since its cliente field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (tarjetaNew != null) {
                tarjetaNew = em.getReference(tarjetaNew.getClass(), tarjetaNew.getId());
                cliente.setTarjeta(tarjetaNew);
            }
            List<Alquiler> attachedAlquilerListNew = new ArrayList<Alquiler>();
            for (Alquiler alquilerListNewAlquilerToAttach : alquilerListNew) {
                alquilerListNewAlquilerToAttach = em.getReference(alquilerListNewAlquilerToAttach.getClass(), alquilerListNewAlquilerToAttach.getId());
                attachedAlquilerListNew.add(alquilerListNewAlquilerToAttach);
            }
            alquilerListNew = attachedAlquilerListNew;
            cliente.setAlquilerList(alquilerListNew);
            cliente = em.merge(cliente);
            if (tarjetaOld != null && !tarjetaOld.equals(tarjetaNew)) {
                tarjetaOld.setCliente(null);
                tarjetaOld = em.merge(tarjetaOld);
            }
            if (tarjetaNew != null && !tarjetaNew.equals(tarjetaOld)) {
                Cliente oldClienteOfTarjeta = tarjetaNew.getCliente();
                if (oldClienteOfTarjeta != null) {
                    oldClienteOfTarjeta.setTarjeta(null);
                    oldClienteOfTarjeta = em.merge(oldClienteOfTarjeta);
                }
                tarjetaNew.setCliente(cliente);
                tarjetaNew = em.merge(tarjetaNew);
            }
            for (Alquiler alquilerListNewAlquiler : alquilerListNew) {
                if (!alquilerListOld.contains(alquilerListNewAlquiler)) {
                    Cliente oldClienteOfAlquilerListNewAlquiler = alquilerListNewAlquiler.getCliente();
                    alquilerListNewAlquiler.setCliente(cliente);
                    alquilerListNewAlquiler = em.merge(alquilerListNewAlquiler);
                    if (oldClienteOfAlquilerListNewAlquiler != null && !oldClienteOfAlquilerListNewAlquiler.equals(cliente)) {
                        oldClienteOfAlquilerListNewAlquiler.getAlquilerList().remove(alquilerListNewAlquiler);
                        oldClienteOfAlquilerListNewAlquiler = em.merge(oldClienteOfAlquilerListNewAlquiler);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = cliente.getId();
                if (findCliente(id) == null) {
                    throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.");
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
            Cliente cliente;
            try {
                cliente = em.getReference(Cliente.class, id);
                cliente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Alquiler> alquilerListOrphanCheck = cliente.getAlquilerList();
            for (Alquiler alquilerListOrphanCheckAlquiler : alquilerListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Cliente (" + cliente + ") cannot be destroyed since the Alquiler " + alquilerListOrphanCheckAlquiler + " in its alquilerList field has a non-nullable cliente field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            TarjetaBancaria tarjeta = cliente.getTarjeta();
            if (tarjeta != null) {
                tarjeta.setCliente(null);
                tarjeta = em.merge(tarjeta);
            }
            em.remove(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cliente> findClienteEntities() {
        return findClienteEntities(true, -1, -1);
    }

    public List<Cliente> findClienteEntities(int maxResults, int firstResult) {
        return findClienteEntities(false, maxResults, firstResult);
    }

    private List<Cliente> findClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cliente.class));
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

    public Cliente findCliente(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cliente> rt = cq.from(Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
