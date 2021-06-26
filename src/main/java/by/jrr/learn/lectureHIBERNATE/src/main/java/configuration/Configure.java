package configuration;

import entity.Address;
import entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.FileReader;
import java.util.Properties;

public class Configure {
    private SessionFactory sessionFactory;

    {
        try {
            Configuration configuration = new Configuration();
            Properties properties = new Properties();
            properties.load(new FileReader("src\\main\\resources\\hibernate.properties"));
            configuration.setProperties(properties);
            configuration.addAnnotatedClass(User.class);
            configuration.addAnnotatedClass(Address.class);
            var serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        }catch (Exception exception) {
            exception.printStackTrace();
        }

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
