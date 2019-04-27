package org.spiders.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.spiders.dto.BooksDto;
import org.spiders.dto.LibraryDto;

import com.spiders.HibernateUtil;

public class LibraryDao {
	public int saveLibrary(LibraryDto libraryDto) {

		SessionFactory factory=HibernateUtil.getFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();

		// return the primary key
		// Integer int id=(Integer)session.save(LibraryDto);
		Serializable save = session.save(libraryDto);
		Integer id = (Integer) save;
 
		session.getTransaction().commit();

		return id;
	}

	public int saveLibraryAndBooks(LibraryDto libraryDto, List<BooksDto> listOfbooks) {

		SessionFactory factory = HibernateUtil.getFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		// List<BooksDto> listOfbooks=libraryDto.getListOfBooks(); in the case of second
		// parameter
		// return the primary key
		// Integer int id=(Integer)session.save(LibraryDto);
		Serializable save = session.save(libraryDto);
		Integer id = (Integer) save;
		
		
		

		for (BooksDto booksDto : listOfbooks) {
			session.save(booksDto);
		}

		session.getTransaction().commit();

		return id;
	}

	
	  public void deleteLibraryById(LibraryDto lib) { SessionFactory factory=
	  HibernateUtil.getFactory();
	  
	  Session session2=factory.openSession(); session2.delete(lib);
	 // LibraryDto lib1= session2.get(LibraryDto.class, new Integer(id));
	  session2.close();
	  
	  }
	 
	// fetch the data
	public void updateLibrary(LibraryDto LibFromRunner)
	{
		//1.save 
		// 2. update
		// 3. delete
		
		SessionFactory factory= HibernateUtil.getFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		// get id using dto object use get method to get the object
		LibraryDto libraryFromDb= session.get(LibraryDto.class, new Integer(LibFromRunner.getId()));
		libraryFromDb.setLibName(LibFromRunner.getLibName());
		libraryFromDb.setLocation(LibFromRunner.getLocation());
		
		//update the object
		session.update(libraryFromDb);
		session.getTransaction().commit();
		session.close();
		
	}
	


	// delete
	public void deleteLibrary(LibraryDto lib)
	{
		SessionFactory factory= HibernateUtil.getFactory();
		
		Session session2=factory.openSession();
		session2.delete(lib);
		session2.close();
		
	}


	

}




