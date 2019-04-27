package org.spiders;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.spiders.dao.LibraryDao;
import org.spiders.dto.BooksDto;
import org.spiders.dto.LibraryDto;

import com.spiders.HibernateUtil;

public class Runner implements Serializable {
	public static void main(String[] args) {

		
		/*
		 * LibraryDto marvel = new LibraryDto(); marvel.setLibName("marvel");
		 * marvel.setLocation("Delhi");
		 * 
		 * LibraryDao libraryDao = new LibraryDao(); // libraryDao.saveLibrary(marvel);
		 * 
		 * // create a list of books
		 * 
		 * List<BooksDto> listOfBooks = new ArrayList<BooksDto>();
		 * 
		 * BooksDto halfGf = new BooksDto(); halfGf.setAuthor("chetan bhagat");
		 * halfGf.setName("half girlfriend"); halfGf.setLibrary(marvel); //
		 * //bidirectional relation ship
		 * 
		 * BooksDto theAlchamist = new BooksDto();
		 * theAlchamist.setAuthor("paulo cohelo");
		 * theAlchamist.setName("The Alchamist"); theAlchamist.setLibrary(marvel);
		 * 
		 * BooksDto rdpd = new BooksDto(); rdpd.setAuthor("robort");
		 * rdpd.setName("Rich Dad Poor Dad"); rdpd.setLibrary(marvel);
		 * 
		 * listOfBooks.add(halfGf); listOfBooks.add(theAlchamist);
		 * listOfBooks.add(rdpd);
		 * 
		 * marvel.setListOfBooks(listOfBooks);
		 */
		 
	//	libraryDao.saveLibraryAndBooks(marvel, listOfBooks);
		/*
		 * LibraryDto marvel = new LibraryDto();
		 * 
		 * LibraryDao libraryDao = new LibraryDao(); libraryDao.getLibraryById(1);
		 * 
		 * System.out.println(LibraryDao.getLibraryById(1));
		 */
	 LibraryDao libraryDao = new LibraryDao();
	 
	 LibraryDto libraryDto = new LibraryDto();
	 libraryDto.setId(1);
	 libraryDto.setLibName("Ajanta");
	 libraryDto.setLocation("Mumbai");
	 
	 libraryDao.updateLibrary(libraryDto);
	}

}













