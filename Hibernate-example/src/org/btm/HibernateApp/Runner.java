package org.btm.HibernateApp;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner {
	//saving logic
	public static void main(String[] args) {
		// configuration object is to hold the information for the three data base
		// 1st friend
		Configuration configuration = new Configuration();
		configuration.configure();//it read the xml file
		System.out.println("xml configured");

		// 2nd friend
		SessionFactory factory = configuration.buildSessionFactory();
		// session is used for /

		Session session = factory.openSession();
		
		
	    Transaction transaction=session.beginTransaction();
		Student st = new Student();
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value");
//		int id=sc.nextInt();
//    	String color=sc.next();
//    	int setMobile=sc.nextInt();
		
		st.setId(1);
		st.setName("color");
		st.setPirce(12);
		
		session.save(st);
		
		transaction.commit();
		
		session.close();
	

	}

}
