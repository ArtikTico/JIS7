package strategies.classPerTable.service;

import configuration.HibernateSessionFactoryUtil;
import org.hibernate.Transaction;
import strategies.classPerTable.FireSpell;
import strategies.classPerTable.FrostSpell;
import strategies.classPerTable.Spell;
import strategies.singletable.Admin;
import strategies.singletable.User;

public class SpellServiceImpl implements SpellService {
//    @Override
//    public Spell createUndefinedSpell(Integer castDuration, Integer damage) {
//        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//
//        Spell spell = new Spell(castDuration, damage);
//        session.save(spell);
//
//        transaction.commit();
//        session.close();
//
//        return spell;
//    }

    @Override
    public Spell createFireSpell(Integer castDuration, Integer damage, Integer burningDuration) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Spell fireSpell = new FireSpell(castDuration, damage, burningDuration);
        session.save(fireSpell);

        transaction.commit();
        session.close();

        return fireSpell;
    }

    @Override
    public Spell createFrostSpell(Integer castDuration, Integer damage, Boolean hasFrozen) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Spell frostSpell = new FrostSpell(castDuration, damage, hasFrozen);
        session.save(frostSpell);

        transaction.commit();
        session.close();

        return frostSpell;
    }
}
