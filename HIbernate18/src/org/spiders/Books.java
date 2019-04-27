package org.spiders;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Books {
	@Column(name = "book_name")
	private String bookName;

	@Column(name = "book_author")
	private String author;

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Books [bookName=" + bookName + ", author=" + author + "]";
	}

}
