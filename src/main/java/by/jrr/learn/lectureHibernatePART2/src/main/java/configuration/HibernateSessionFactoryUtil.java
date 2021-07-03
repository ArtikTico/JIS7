package configuration;

import connections.oneToMany.Ability;
import connections.oneToMany.Hero;
import connections.oneToOne.RecordBook;
import connections.oneToOne.Student;
import lombok.SneakyThrows;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import strategies.classPerTable.FireSpell;
import strategies.classPerTable.FrostSpell;
import strategies.classPerTable.Spell;
import strategies.joined.Archer;
import strategies.joined.Infantry;
import strategies.joined.Knight;
import strategies.mappedbysuperclass.entity.Tank;
import strategies.mappedbysuperclass.entity.Truck;
import strategies.mappedbysuperclass.entity.Vehicle;
import strategies.singletable.Admin;
import strategies.singletable.Lecturer;
import strategies.singletable.User;

import java.io.FileReader;
import java.util.Properties;

public class HibernateSessionFactoryUtil {

    private static SessionFactory sessionFactory;

    @SneakyThrows
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            Properties properties = new Properties();
            properties.load(new FileReader("src\\main\\resources\\hibernate.properties"));
            configuration.setProperties(properties);
            configuration.addAnnotatedClass(Vehicle.class);
            configuration.addAnnotatedClass(Tank.class);
            configuration.addAnnotatedClass(Truck.class);
            configuration.addAnnotatedClass(Infantry.class);
            configuration.addAnnotatedClass(Archer.class);
            configuration.addAnnotatedClass(Knight.class);
            configuration.addAnnotatedClass(User.class);
            configuration.addAnnotatedClass(Admin.class);
            configuration.addAnnotatedClass(Lecturer.class);
            configuration.addAnnotatedClass(Spell.class);
            configuration.addAnnotatedClass(FrostSpell.class);
            configuration.addAnnotatedClass(FireSpell.class);
            configuration.addAnnotatedClass(Student.class);
            configuration.addAnnotatedClass(RecordBook.class);
            configuration.addAnnotatedClass(Hero.class);
            configuration.addAnnotatedClass(Ability.class);
            var serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }
}
