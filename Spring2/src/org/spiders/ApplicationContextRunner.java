package org.spiders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class ApplicationContextRunner 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("org/spiders/spring.xml");
    	
		/*
		 * SchoolDTO sc=context.getBean(SchoolDTO.class);
		 *  System.out.println(sc);
		 */
		  SchoolDTO sc=(SchoolDTO)context.getBean("sc");
    }
}
