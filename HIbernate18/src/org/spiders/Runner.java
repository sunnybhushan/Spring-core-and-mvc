package org.spiders;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.spiders.HibernateUtil;

public class Runner 
{
	public static void main(String[] args)
	{
		SessionFactory factory = HibernateUtil.getFactory();

		// to perform CRUD operations
		Session session = factory.openSession();

		Library marvel = new Library();
		marvel.setName("marvel");
		marvel.setLibrarianName("Mr Taneja");

		// create a list of books

		List<Books> listOfBooks = new ArrayList<Books>();

		Books halfGf = new Books();
		halfGf.setAuthor("chetan bhagat");
		halfGf.setBookName("half girlfriend");

		Books theAlchamist = new Books();
		theAlchamist.setAuthor("paulo cohelo");
		theAlchamist.setBookName("The Alchamist");

		Books rdpd = new Books();
		rdpd.setAuthor("robort");
		rdpd.setBookName("Rich Dad Poor Dad");

		listOfBooks.add(halfGf);
		listOfBooks.add(theAlchamist);
		listOfBooks.add(rdpd);

		marvel.setListOfBooks(listOfBooks);

		session.beginTransaction();
		session.save(marvel);

		session.getTransaction().commit();
		session.close();

	}

}



