/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlers;

import controlers.exceptions.NonexistentEntityException;
import entities.TarjetasBancarias;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tarjetasBancarias);
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
            tarjetasBancarias = em.merge(tarjetasBancarias);
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
