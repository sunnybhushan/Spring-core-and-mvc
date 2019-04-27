package org.hibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner
{

	public static void main(String[] args) {
		/*
		 * Configuration con= new Configuration(); System.out.println("xml configured");
		 * SessionFactory sf=con.buildSessionFactory(); Session
		 * session=sf.openSession(); Transaction tx=session.beginTransaction();
		 */
		
		
		Name st= new Name();
		st.setRoll(1);
		st.setName("Sunny");
		st.setMobile(122455);
		session.save(st);
		tx.commit();
	
		
	}
}
