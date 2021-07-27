package hibernate.demo;

import hibernate.demo.config.HibernateUtil;
import hibernate.demo.domain.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class DemoApplication {
    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Person person=new Person("Ovidiu",21,"Lipianu");
        session.save(person);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
