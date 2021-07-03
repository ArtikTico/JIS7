package strategies.mappedbysuperclass.service;

import configuration.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import strategies.mappedbysuperclass.entity.Tank;
import strategies.mappedbysuperclass.entity.Truck;
import strategies.mappedbysuperclass.entity.Vehicle;

public class VehicleServiceImpl implements VehicleService {

    @Override
    public Vehicle createTruck(String name, Integer seats, Integer maxLoad, Boolean sleeperCab) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        Vehicle truck = new Truck(name, seats, maxLoad, sleeperCab);
        var transaction = session.beginTransaction();
        session.save(truck);
        transaction.commit();
        session.close();
        return truck;
    }

    @Override
    public Vehicle createTank(String name, Integer seats, Integer firePower) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        Vehicle tank = new Tank(name, seats, firePower);

        var transaction = session.beginTransaction();
        session.save(tank);
        transaction.commit();
        session.close();
        return tank;
    }
}
