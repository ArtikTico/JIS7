package strategies.singletable.service;

import configuration.HibernateSessionFactoryUtil;
import org.hibernate.Transaction;
import strategies.singletable.Admin;
import strategies.singletable.Lecturer;
import strategies.singletable.User;

public class UserServiceImpl implements UserService {
    @Override
    public User createUser(String name) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        User user = new User(name);
        session.save(user);

        transaction.commit();
        session.close();

        return user;
    }

    @Override
    public User createAdmin(String name, Boolean hasFullAccess) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        User admin = new Admin(name, hasFullAccess);
        session.save(admin);

        transaction.commit();
        session.close();

        return admin;
    }

    @Override
    public User createLecturer(String name, Integer studentCount) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        User lecturer = new Lecturer(name, studentCount);
        session.save(lecturer);

        transaction.commit();
        session.close();

        return lecturer;
    }
}
