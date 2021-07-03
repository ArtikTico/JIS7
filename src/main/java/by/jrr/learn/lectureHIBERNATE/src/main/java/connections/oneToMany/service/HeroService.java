package connections.oneToMany.service;

import configuration.HibernateSessionFactoryUtil;
import connections.oneToMany.Ability;
import connections.oneToMany.Hero;
import connections.oneToOne.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Collection;

public class HeroService {

    public Hero createHero(String name) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        var hero = new Hero(name);
        session.save(hero);
        transaction.commit();
        session.close();
        return hero;
    }

    public Ability createAbility(String name, Integer power, Hero hero) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        var ability = new Ability(name, power, hero);
        session.save(ability);
        transaction.commit();
        session.close();
        return ability;
    }
}
