package org.spiders;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spiders.HibernateUtil;

public class Runner implements Serializable
{
	public static void main(String[] args)
	{
		SessionFactory factory= HibernateUtil.getFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		Library marvel = new Library();
		marvel.setLibName("marvel");
		marvel.setLocation("Delhi");

		// create a list of books

		List<Books> listOfBooks = new ArrayList<Books>();

		Books halfGf = new Books();
		halfGf.setAuthor("chetan bhagat");
		halfGf.setName("half girlfriend");
		halfGf.setLibrary(marvel); // bidirectional relation ship

		Books theAlchamist = new Books();
		theAlchamist.setAuthor("paulo cohelo");
		theAlchamist.setName("The Alchamist");
		theAlchamist.setLibrary(marvel);

		Books rdpd = new Books();
		rdpd.setAuthor("robort");
		rdpd.setName("Rich Dad Poor Dad");
		rdpd.setLibrary(marvel);
	
		listOfBooks.add(halfGf);
		listOfBooks.add(theAlchamist);
		listOfBooks.add(rdpd);

		marvel.setListOfBooks(listOfBooks);
	
		session.save(halfGf);
		session.save(theAlchamist);
		session.save(rdpd);
		session.save(marvel);
		

		session.getTransaction().commit();
		session.close();

		
	}
}
