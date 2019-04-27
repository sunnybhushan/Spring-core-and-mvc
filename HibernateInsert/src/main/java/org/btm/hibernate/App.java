package org.btm.hibernate;

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
    SessionFactory sf=con.buildSessionFactory();
    Session session=sf.openSession();
    Transaction tnx=session.beginTransaction();
    
    Student std=new Student();
    std.setId(2);
    std.setName("sunny");
    std.setMobileNo(933322);
    std.setPercent(45.2);
    session.save(std);
    tnx.commit();
    }
}
