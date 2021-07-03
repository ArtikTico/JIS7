package strategies.joined.service;

import configuration.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import strategies.joined.Archer;
import strategies.joined.Infantry;
import strategies.joined.InfantryType;
import strategies.joined.Knight;

public class InfantryServiceImpl implements InfantryService {

    @Override
    public Infantry createArcher(InfantryType infantryType, Integer moveSpeed, Integer durability, Integer range) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Infantry archer = new Archer(infantryType, moveSpeed, durability, range);
        session.save(archer);

        transaction.commit();
        session.close();

        return archer;
    }

    @Override
    public Infantry createKnight(InfantryType infantryType, Integer moveSpeed, Integer durability, Boolean hasShield) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Infantry knight = new Knight(infantryType, moveSpeed, durability, hasShield);
        session.save(knight);

        transaction.commit();
        session.close();

        return knight;
    }
}
