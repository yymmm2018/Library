package dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "book")
@Entity
public class Book {

	@Column
	String name;
	
	@Column
	String author;
	
	@Column
	String press;
	
	@Column
	String constriction;
	
	@Column
	int bookId;

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

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public String getConstriction() {
		return constriction;
	}

	public void setConstriction(String constriction) {
		this.constriction = constriction;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	
}
