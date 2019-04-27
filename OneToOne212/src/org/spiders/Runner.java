package org.spiders;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.spiders.HibernateUtil;

public class Runner implements Serializable {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();

		Transaction tnx = session.beginTransaction();

		College college1 = new College();
		college1.setColor("blue");
		college1.setName("Zys college");

		Student std = new Student();
		std.setAttendence("absent");
		std.setName("shayam");

		std.setCollege(college1);
		college1.setStudent(std);

		// Transaction tnx=session.beginTransaction();
//	    
//	    College c=new College();
//	    c=(College)session.get(College.class, new Integer(1));
//	    
//	    Student std=new Student();

		// System.out.println(c.getId());

		// System.out.println(c);

		session.save(college1);
		session.save(std);
		tnx.commit();
		session.close();

	}
}
