package org.spiders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("org/spiders/spring.xml");
		
		School sc= context.getBean(School.class, "sc");
		
		System.out.println(sc);
		
		/*
		 * Student stud=context.getBean(Student.class, "stud");
		 * System.out.println(stud);
		 */
		
		
	}
}
