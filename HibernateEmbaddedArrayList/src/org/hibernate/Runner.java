package org.hibernate;

import java.util.ArrayList;
import java.util.List;

import com.spiders.HibernateUtil;

public class Runner 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=HibernateUtil.getFactory();
		
		Session session=factory.openSession();
		
		Transaction txn =session.beginTransaction();
		
		Tree mangoTree= new  Tree();
		mangoTree.setAge(12);
		mangoTree.setTreeName("mango");
		
		List<Fruit> listOfFruits= new ArrayList<Fruit>();
		
		Fruit fruit1=new Fruit();
		fruit1.setColor("green");
		fruit1.setNoOfSeeds(12);
		
		Fruit fruit2=new Fruit();
		fruit2.setColor("red");
		fruit2.setNoOfSeeds(3);
		
		Fruit fruit3=new Fruit();
		fruit3.setColor("yellow");
		fruit3.setNoOfSeeds(4);
	
		listOfFruits.add(fruit1);
		listOfFruits.add(fruit2);
		listOfFruits.add(fruit3);
		
		mangoTree.setFruits(listOfFruits);
		
		session.save(mangoTree);
		txn.commit();
		session.close();
		
	}
}
