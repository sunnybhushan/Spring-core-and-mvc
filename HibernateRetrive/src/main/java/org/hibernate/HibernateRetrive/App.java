package org.hibernate.HibernateRetrive;

import org.hibernate.*;

import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    Configuration con=new Configuration();
    con.configure();
    System.out.println("xml configured");
    @SuppressWarnings("deprecation")
	SessionFactory sf=con.buildSessionFactory();
    Session session=sf.openSession();
    
    
    
    Transaction tnx=session.beginTransaction();
    
    College c=new College();
    c=(College)session.get(College.class, new Integer(1));

   // System.out.println(c.getId());
    
    System.out.println(c);
    //c.setId(3);
    c.setMobileNo(6516);
    c.setName("ssh");
    c.setPercent(25.22);
    session.update(c);
    
    tnx.commit();
    session.close();
    
    
    
    
    }
}













