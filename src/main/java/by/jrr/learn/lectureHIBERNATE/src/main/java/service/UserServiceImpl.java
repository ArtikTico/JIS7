package service;

import configuration.Configure;
import entity.User;
import java.util.Collection;

public class UserServiceImpl implements UserService {

    private final Configure configure = new Configure();

    @Override
    public User create(String firstName, String lastName, String username, String email) {
        var sessionFactory = configure.getSessionFactory();
        var session = sessionFactory.openSession();
        var transaction = session.beginTransaction();

        User user = User.builder()
                .firstName(firstName)
                .lastName(lastName)
                .username(username)
                .email(email)
                .build();

        session.save(user);
        transaction.commit();
        session.close();
        return user;
    }

    @Override
    public Collection<User> findAll() {
        var sessionFactory = configure.getSessionFactory();
        var session = sessionFactory.openSession();
        var transaction = session.beginTransaction();

        String sql = "SELECT u FROM User u";

        var userList = session.createQuery(sql, User.class).getResultList();

        transaction.commit();
        session.close();

        return userList;
    }
}
