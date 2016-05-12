package com.sam.lms;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Books {
	
	public Books(Integer bookID,String subject,String title,String author,String publisher,String isbn,Integer numOfBooks,Integer numOfAvailBooks,Integer numOfBorrowedBooks){
		
		this.bookID = bookID;
		this.subject = subject;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
		this.numOfBooks = numOfBooks;
		this.numOfAvailBooks = numOfAvailBooks;
		this.numOfBorrowedBooks = numOfBorrowedBooks;
	}
	 
	@Id
	@Column(name="bookid")
	private Integer bookID;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="title")
	private String title;
	
	@Column(name="author")
	private String author;
	
	@Column(name="publisher")
	private String publisher;
	
	@Column(name="isbn")
	private String isbn;
	
	@Column(name="numofbooks")
	private Integer numOfBooks;
	
	@Column(name="numofavailbooks")
	private Integer numOfAvailBooks;
	
	@Column(name="numofborrowedbooks")
	private Integer numOfBorrowedBooks;
	
	public Integer getBookID() {
		return bookID;
	}
	public void setBookID(Integer bookID) {
		this.bookID = bookID;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Integer getNumOfBooks() {
		return numOfBooks;
	}
	public void setNumOfBooks(Integer numOfBooks) {
		this.numOfBooks = numOfBooks;
	}
	public Integer getNumOfAvailBooks() {
		return numOfAvailBooks;
	}
	public void setNumOfAvailBooks(Integer numOfAvailBooks) {
		this.numOfAvailBooks = numOfAvailBooks;
	}
	public Integer getNumOfBorrowedBooks() {
		return numOfBorrowedBooks;
	}
	public void setNumOfBorrowedBooks(Integer numOfBorrowedBooks) {
		this.numOfBorrowedBooks = numOfBorrowedBooks;
	}


}
