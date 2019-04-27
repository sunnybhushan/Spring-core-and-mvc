package org.spiders.springsApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("org/spiders/springsApp/spring.xml");
    	SchoolDTO sc= context.getBean(SchoolDTO.class);
    	System.out.println(sc);
    	
		
		  Saurav sv=context.getBean(Saurav.class); 
		  System.out.println(sv);
		  
		  
		 
    	
    }
}
