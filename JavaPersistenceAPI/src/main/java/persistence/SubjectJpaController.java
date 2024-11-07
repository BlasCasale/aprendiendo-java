package persistence;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logic.Subject;

public class SubjectJpaController implements Serializable {

    private EntityManagerFactory emf = null;

    public SubjectJpaController() {
        emf = Persistence.createEntityManagerFactory("persistencePU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Subject subject) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(subject);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Subject findSubject(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Subject.class, id);
        } finally {
            em.close();
        }
    }

    public List<Subject> findAllSubjects() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT s FROM Subject s", Subject.class).getResultList();
        } finally {
            em.close();
        }
    }

    public void update(Subject subject) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(subject);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void delete(int id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Subject subject = em.find(Subject.class, id);
            if (subject != null) {
                em.remove(subject);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
