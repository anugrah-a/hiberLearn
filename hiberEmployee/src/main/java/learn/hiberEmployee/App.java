package learn.hiberEmployee;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); 
        SessionFactory fact = cfg.buildSessionFactory();
        Session sess = fact.openSession();
        Transaction tx = sess.beginTransaction();
       
        //Employee emp = new Employee("Amit", 25000, "manager", "dev");
        Person p1 = new Person();
        AdhaarCard ad = new AdhaarCard(1111, "deep", "btm", "male", p1);
        p1.setId(101);
        p1.setNickName("dee");
        p1.setCard(ad);
        
        /*
        PersonBike p = new PersonBike();
 
        
        
        Bike b1 = new Bike(1001, "pulsar", 97000, p);
        Bike b2 = new Bike(2002, "apache", 80000, p);
        
        
        List<Bike> bikeList = new ArrayList<Bike>();
        bikeList.add(b1);
        bikeList.add(b2);
        
        p.setId(1);
        p.setName("mahi");
        p.setBikeList(bikeList);
        
        
        sess.persist(p);
        sess.persist(b1);
        sess.persist(b2);
        */
        tx.commit();
    }
}
