package org.spiders.springsApp;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@Deprecated
public class BeanFactoryRunner
{
	public static void main(String[] args)
	{
BeanFactory factory= new XmlBeanFactory(new FileSystemResource("src/main/java/org/spiders/springsApp/spring.xml"));
		
		SchoolDTO sc=(SchoolDTO)factory.getBean("sc");
		  SchoolDTO sc1=(SchoolDTO)factory.getBean("sc");
		  SchoolDTO sc2=(SchoolDTO)factory.getBean("sc");
		 
		
	}
}


