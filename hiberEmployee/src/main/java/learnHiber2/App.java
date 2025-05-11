package learnHiber2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import learnHiber2.*;


public class App {

    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
        cfg.configure("hibernate2.cfg.xml"); 
        SessionFactory fact = cfg.buildSessionFactory();
        Session sess = fact.openSession();
        Transaction tx = sess.beginTransaction();
        
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
        
        PersonBike p1 = new PersonBike();
        Bike b3 = new Bike(3001, "honda", 88000, p1);
        Bike b4 = new Bike(4002, "dominar", 120000, p1);
        
        bikeList.add(b3);
        bikeList.add(b4);
        
        p1.setId(2);
        p1.setName("sachin");
        p1.setBikeList(bikeList);
        
        sess.persist(p1);
        sess.persist(b3);
        sess.persist(b4);
        tx.commit();
    }
}
