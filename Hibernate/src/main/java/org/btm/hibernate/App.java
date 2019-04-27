package org.btm.hibernate;
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
    	Student st= new Student();
    	
    	st.setId(3);
    	st.setColor("color");
    	st.setMobile(121545);
    	
    	Configuration con=new Configuration();
    	con.configure();
    	SessionFactory sf=con.buildSessionFactory();
    	  	
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	session.save(st);
    	tx.commit();
    }
}





