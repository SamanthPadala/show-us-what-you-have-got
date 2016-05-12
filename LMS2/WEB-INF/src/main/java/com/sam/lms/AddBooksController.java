package com.sam.lms;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class AddBooksController implements Controller {
	
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res){
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/html/AddedBooks.html");
		return mav;
	}
	
	public void addBooks(Integer bookID,String subject,String title,String author,String publisher,String isbn,Integer numOfBooks,Integer numOfAvailBooks,Integer numOfBorrowedBooks){
		HttpServletRequest req = null;
		HttpServletResponse res = null;
		AddBooks addBooks = new AddBooks();
		addBooks.addBooks(bookID, subject, title, author, publisher, isbn, numOfBooks, numOfAvailBooks, numOfBorrowedBooks);
		handleRequest(req, res);
	}

}
