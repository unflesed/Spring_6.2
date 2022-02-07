package homework.persistence.dao.repositories;

import homework.persistence.model.Counter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CounterRepositoryJPA {
    EntityManagerFactory emf;
    EntityManager em;

    public CounterRepositoryJPA() {
        emf = Persistence.createEntityManagerFactory("item");
        em = emf.createEntityManager();
    }
    public void add(Counter c) {
        em.getTransaction().begin();
        em.merge(c);
        em.getTransaction().commit();
    }
    public Counter getById(long id) {
        em.getTransaction().begin();
        Counter counter = em.find(Counter.class, id);
        em.getTransaction().commit();
        return counter;
    }
}
