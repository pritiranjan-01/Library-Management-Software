package com.library.classes;

public class Book {
	private final int bookId; // Final as bookId cant be modified further.
	private String title;
	private String author;
	private boolean isIssued = false;
	private String issuedTo= null;
	private BookCategory bookCategory;
	
	
	public Book(int bookId, String title, String author, BookCategory bookCategory) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.bookCategory=bookCategory;
	}
	
	@Override
	public String toString() {
		//return "[Id: "+bookId+", Title: "+title+", Author`: "+author+", isIssued: "+isIssued+"]";
		 return String.format( "ID: %d, Title: %s, Author: %s, Category: %s, isIssued: %B, IssuedTo: %s",
				 					bookId, title, author, bookCategory,isIssued, issuedTo);
	}
	
	public int getBookId() {
		return bookId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuther() {
		return author;
	}
	
	public boolean checkIsIssued() {
		return isIssued;
	}
	
	public void setIssue(boolean value) {
		isIssued=value;
	}
	
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	
	public void setAuther(String newAuther) {
		this.author = newAuther;
	}
	
	public String getIssuedTo() {
		return issuedTo;
	}
	
	public void setIssuedTo(String issuedTo) {
		this.issuedTo = issuedTo;
	}
	
	public BookCategory getBookCategory() {
		return bookCategory;
	}
}






