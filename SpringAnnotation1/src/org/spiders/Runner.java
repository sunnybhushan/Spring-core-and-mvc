package org.spiders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner 
{
	public static void main(String[] args)
	{

		AbstractApplicationContext context= 
				new ClassPathXmlApplicationContext("org/spiders/spring.xml");
		
	         School sc=(School)context.getBean("sc");
	         School sc2=(School)context.getBean("sc");
	         School sc3=(School)context.getBean("sc");
	         School sc4=(School)context.getBean("sc");
		
		context.close();
	}
}
