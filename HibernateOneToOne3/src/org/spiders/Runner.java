package org.spiders;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.spiders.HibernateUtil;

public class Runner implements Serializable {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();

		Transaction tnx = session.beginTransaction();

		
		
		

		Student std1 = new Student();
		std1.setAttendence("present");
		std1.setName("kumar");
		
		Student std2 = new Student();
		std2.setAttendence("absent");
		std2.setName("sunny");
		
		Student std3 = new Student();
		std3.setAttendence("absent");
		std3.setName("ravi");
		
		List<Student> list= new ArrayList<Student>();
		list.add(std1);
		list.add(std2);
		list.add(std3);
		
		College college1 = new College();
		college1.setColor("blue");
		college1.setName("Zys college");
		college1.setStudentList(list);

		/*
		 * std.setCollege(college1); college1.setStudent(std);
		 */
		// Transaction tnx=session.beginTransaction();
//	    
//	    College c=new College();
//	    c=(College)session.get(College.class, new Integer(1));
//	    
//	    Student std=new Student();

		// System.out.println(c.getId());

		// System.out.println(c);

		session.save(college1);
		
		tnx.commit();
		session.close();

	}
}
