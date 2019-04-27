package org.spiders.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="book_table")
public class BooksDto implements Serializable
{
	
	@Id
	@GeneratedValue(generator = "abc")
	@GenericGenerator(name = "abc", strategy = "increment")
	@Column(name = "book_id")
	private int id;
	@Column(name="books_name")
	private String name;
	private String author;
	
	@ManyToOne
	private LibraryDto library;
	
	public LibraryDto getLibrary() {
		return library;
	}
	public void setLibrary(LibraryDto library) {
		this.library = library;
	}
	public BooksDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", author=" + author + ", library=" + library + "]";
	}
	
	
	
	
}