package connections.oneToOne;

import configuration.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudyServiceImpl implements StudyService {
    @Override
    public Student createStudent(String name, RecordBook recordBook) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Student student = new Student(name, recordBook);
        session.save(student);
        transaction.commit();
        session.close();
        return student;
    }

    @Override
    public RecordBook createRecordBook(String number) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        RecordBook recordBook = new RecordBook(number);
        session.save(recordBook);
        transaction.commit();
        session.close();
        return recordBook;
    }

    @Override
    public Student findStudentById(Long id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        var student = session.get(Student.class, id);
        transaction.commit();
        session.close();
        return student;
    }
}
