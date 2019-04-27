package org.spiders;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.spiders.HibernateUtil;

public class Runner implements Serializable
{
	SessionFactory factory=HibernateUtil.getFactory();
	Session session = factory.openSession();
	
	Transaction txn=session.beginTransaction();
	
	Laptop lp= new Laptop();
	lp.set
	 
	
	
	
	Laptop lp=new Laptop();
	
	
}
