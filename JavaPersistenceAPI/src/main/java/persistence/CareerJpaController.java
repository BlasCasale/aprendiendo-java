package persistence;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logic.Career;

public class CareerJpaController implements Serializable {

    private EntityManagerFactory emf = null;

    public CareerJpaController() {
        emf = Persistence.createEntityManagerFactory("persistencePU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Career career) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(career);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Career findCareer(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Career.class, id);
        } finally {
            em.close();
        }
    }

    public List<Career> findAllCareers() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT c FROM Career c", Career.class).getResultList();
        } finally {
            em.close();
        }
    }

    public void update(Career career) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(career);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Career career = em.find(Career.class, id);
            if (career != null) {
                em.remove(career);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
