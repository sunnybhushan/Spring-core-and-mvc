package org.spider;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spiders.HibernateUtil;

public class Runner {

	public static void main(String[] args) {
		// make connection
		// built session
		// mapping classes to table
		// 2nd level cache maintainer
		SessionFactory factory = HibernateUtil.getFactory();
		
	
		// CRUD operation\
		// 1st level cache maintainer
		Session session = factory.openSession();

		session.beginTransaction();

		Human sunny = new Human();
		sunny.setFirstName("Abc");
		sunny.setlName("Zyx");
		sunny.setAge(02);

		Heart heart = new Heart();
		heart.setBeatPerMin(10);
		heart.setHasDisease(false);

		 sunny.setHeart(heart);

		//heart.setHuman(sunny);
		session.save(sunny);
		session.save(heart);

		session.getTransaction().commit();
		session.close();

	}
}
