package com.Embaded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spiders.HibernateUtil;


public class Runner 
{
	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.getFactory();
				
				
		
//		Configuration con=new  Configuration();
//		con.configure();
//		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction txn=session.beginTransaction();
		
		
		
		Laptop lp = new Laptop();
		lp.setHardDriveSpace("slkjs");
		lp.setRam("kjsafh");
		
		Student student= new Student();
		student.setMobilNo(69955);
		student.setStdStream("cs");
		
		student.setLaptop(lp);
		
		
		session.save(student);
		txn.commit();
		session.close();
		
	}
}
