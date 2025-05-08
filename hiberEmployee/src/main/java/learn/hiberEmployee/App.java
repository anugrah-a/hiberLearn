package learn.hiberEmployee;

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
        
        sess.persist(ad);
        sess.persist(p1);
        
        tx.commit();
    }
}
