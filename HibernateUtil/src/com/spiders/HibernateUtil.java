package com.spiders;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
	private static SessionFactory factory=null;
	
	static
	{
		Configuration cfg=new Configuration();
		cfg.configure("My.cfg.xml");
		factory =cfg.buildSessionFactory();
	}
	
	private HibernateUtil()
	{
		System.out.println("session factory created");
	}
	
	static public SessionFactory getFactory()
	{
		return factory;
	}
	
	public static void main(String[] args) 
	{
		getFactory();
	}
}








