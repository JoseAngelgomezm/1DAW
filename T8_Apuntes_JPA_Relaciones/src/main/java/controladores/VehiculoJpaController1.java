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
import entidades.Alquiler;
import entidades.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author joseangel
 */
public class VehiculoJpaController1 implements Serializable {

    public VehiculoJpaController1(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Vehiculo vehiculo) {
        if (vehiculo.getAlquilerList() == null) {
            vehiculo.setAlquilerList(new ArrayList<Alquiler>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Alquiler> attachedAlquilerList = new ArrayList<Alquiler>();
            for (Alquiler alquilerListAlquilerToAttach : vehiculo.getAlquilerList()) {
                alquilerListAlquilerToAttach = em.getReference(alquilerListAlquilerToAttach.getClass(), alquilerListAlquilerToAttach.getId());
                attachedAlquilerList.add(alquilerListAlquilerToAttach);
            }
            vehiculo.setAlquilerList(attachedAlquilerList);
            em.persist(vehiculo);
            for (Alquiler alquilerListAlquiler : vehiculo.getAlquilerList()) {
                Vehiculo oldVehiculoOfAlquilerListAlquiler = alquilerListAlquiler.getVehiculo();
                alquilerListAlquiler.setVehiculo(vehiculo);
                alquilerListAlquiler = em.merge(alquilerListAlquiler);
                if (oldVehiculoOfAlquilerListAlquiler != null) {
                    oldVehiculoOfAlquilerListAlquiler.getAlquilerList().remove(alquilerListAlquiler);
                    oldVehiculoOfAlquilerListAlquiler = em.merge(oldVehiculoOfAlquilerListAlquiler);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Vehiculo vehiculo) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Vehiculo persistentVehiculo = em.find(Vehiculo.class, vehiculo.getId());
            List<Alquiler> alquilerListOld = persistentVehiculo.getAlquilerList();
            List<Alquiler> alquilerListNew = vehiculo.getAlquilerList();
            List<String> illegalOrphanMessages = null;
            for (Alquiler alquilerListOldAlquiler : alquilerListOld) {
                if (!alquilerListNew.contains(alquilerListOldAlquiler)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Alquiler " + alquilerListOldAlquiler + " since its vehiculo field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<Alquiler> attachedAlquilerListNew = new ArrayList<Alquiler>();
            for (Alquiler alquilerListNewAlquilerToAttach : alquilerListNew) {
                alquilerListNewAlquilerToAttach = em.getReference(alquilerListNewAlquilerToAttach.getClass(), alquilerListNewAlquilerToAttach.getId());
                attachedAlquilerListNew.add(alquilerListNewAlquilerToAttach);
            }
            alquilerListNew = attachedAlquilerListNew;
            vehiculo.setAlquilerList(alquilerListNew);
            vehiculo = em.merge(vehiculo);
            for (Alquiler alquilerListNewAlquiler : alquilerListNew) {
                if (!alquilerListOld.contains(alquilerListNewAlquiler)) {
                    Vehiculo oldVehiculoOfAlquilerListNewAlquiler = alquilerListNewAlquiler.getVehiculo();
                    alquilerListNewAlquiler.setVehiculo(vehiculo);
                    alquilerListNewAlquiler = em.merge(alquilerListNewAlquiler);
                    if (oldVehiculoOfAlquilerListNewAlquiler != null && !oldVehiculoOfAlquilerListNewAlquiler.equals(vehiculo)) {
                        oldVehiculoOfAlquilerListNewAlquiler.getAlquilerList().remove(alquilerListNewAlquiler);
                        oldVehiculoOfAlquilerListNewAlquiler = em.merge(oldVehiculoOfAlquilerListNewAlquiler);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = vehiculo.getId();
                if (findVehiculo(id) == null) {
                    throw new NonexistentEntityException("The vehiculo with id " + id + " no longer exists.");
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
            Vehiculo vehiculo;
            try {
                vehiculo = em.getReference(Vehiculo.class, id);
                vehiculo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The vehiculo with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Alquiler> alquilerListOrphanCheck = vehiculo.getAlquilerList();
            for (Alquiler alquilerListOrphanCheckAlquiler : alquilerListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Vehiculo (" + vehiculo + ") cannot be destroyed since the Alquiler " + alquilerListOrphanCheckAlquiler + " in its alquilerList field has a non-nullable vehiculo field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(vehiculo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Vehiculo> findVehiculoEntities() {
        return findVehiculoEntities(true, -1, -1);
    }

    public List<Vehiculo> findVehiculoEntities(int maxResults, int firstResult) {
        return findVehiculoEntities(false, maxResults, firstResult);
    }

    private List<Vehiculo> findVehiculoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Vehiculo.class));
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

    public Vehiculo findVehiculo(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Vehiculo.class, id);
        } finally {
            em.close();
        }
    }

    public int getVehiculoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Vehiculo> rt = cq.from(Vehiculo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
