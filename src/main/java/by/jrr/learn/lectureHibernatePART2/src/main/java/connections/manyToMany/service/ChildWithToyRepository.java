package connections.manyToMany.service;

import configuration.HibernateSessionFactoryUtil;
import connections.manyToMany.Child;
import connections.manyToMany.Toy;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Collection;

public class ChildWithToyRepository {
    
    public Child createChild(String name, Collection<Toy> toys) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        var child = new Child(name, toys);
        session.save(child);
        transaction.commit();
        session.close();
        return child;
    }

    public Toy createToy(String name) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        var toy = new Toy(name);
        session.save(toy);
        transaction.commit();
        session.close();
        return toy;
    }
    
    public Collection<Toy> findAllToys() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        var toys = session.createQuery("from Toy").getResultList();
        transaction.commit();
        session.close();
        return toys;
    }
}
