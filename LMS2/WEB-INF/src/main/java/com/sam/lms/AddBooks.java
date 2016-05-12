package com.sam.lms;

import org.springframework.orm.hibernate4.HibernateTemplate;

public class AddBooks {
	
	private HibernateTemplate hibernateTemplate;
	
	public void addBooks(Integer bookID,String subject,String title,String author,String publisher,String isbn,Integer numOfBooks,Integer numOfAvailBooks,Integer numOfBorrowedBooks){
		
		Books books = new Books(bookID,subject,title,author,publisher,isbn,numOfBooks,numOfAvailBooks,numOfBorrowedBooks);
		hibernateTemplate.save(books);
	}

}
