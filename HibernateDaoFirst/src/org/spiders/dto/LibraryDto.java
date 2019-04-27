package org.spiders.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "library_books")
public class LibraryDto implements Serializable {
	@Id
	@GeneratedValue(generator = "abc")
	@GenericGenerator(name = "abc", strategy = "increment")
	private int id;

	@Column(name = "library_loc")
	private String location;

	@Column(name = "lib_name")
	private String libName;

	@OneToMany(mappedBy = "library")
	private List<BooksDto> ListOfBooks;

	public LibraryDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLibName() {
		return libName;
	}

	public void setLibName(String libName) {
		this.libName = libName;
	}

	public List<BooksDto> getListOfBooks() {
		return ListOfBooks;
	}

	public void setListOfBooks(List<BooksDto> listOfBooks) {
		ListOfBooks = listOfBooks;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", location=" + location + ", libName=" + libName + ", ListOfBooks=" + ListOfBooks
				+ "]";
	}

}
