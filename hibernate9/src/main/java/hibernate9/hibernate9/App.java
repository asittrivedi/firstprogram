package hibernate9.hibernate9;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     Session session=hibernate9config.getSessionFactory().openSession();
     Transaction tran=session.beginTransaction();
     address1 a=new address1();
     a.setCity("noida");a.setId(11);a.setName("asit");a.setState("up");
     employee1 e=new employee1();
     e.setId(10);e.setName("rahul");
     session.save(e);
     session.save(a);
     tran.commit();
     session.close();
     
    }
}
