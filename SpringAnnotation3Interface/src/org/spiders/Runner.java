package org.spiders;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner 
{
	public static void main(String[] args)
	{

		ApplicationContext context= 
				new ClassPathXmlApplicationContext("org/spiders/spring.xml");
		
		 Computer com=(Computer)context.getBean("com");
		 System.out.println(com);
	}
}
