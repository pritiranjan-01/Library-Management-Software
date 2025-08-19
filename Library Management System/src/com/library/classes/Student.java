package com.library.classes;

import java.util.ArrayList;

public class Student {
	private int id;
	private String name;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public static void displayBooks() {
		Library lib = Library.getLibrary();
		lib.showBooks();
	}
	
	public static void studentIssueBook(int bookId,String studentName) {
		Library lib = Library.getLibrary();
		Book tobeIssued=lib.getBookbyId(bookId);
		if(tobeIssued !=null) {
			if(tobeIssued.checkIsIssued()==false) {
				tobeIssued.setIssue(true);
				tobeIssued.setIssuedTo(studentName);
				System.out.println("\nBook Issued Successfully");
			}
			else System.out.println("\nBook is issued for another Student");
		}
		else System.out.println("Book with Id "+bookId+" is not found to Issue");
	}
	
	public static void studentReturnBook(int bookId,String studentName) {
		Library lib = Library.getLibrary();
		Book tobeReturned=lib.getBookbyId(bookId);
		if(tobeReturned !=null){
			if(tobeReturned.checkIsIssued()==true) {
				// if currrent student is same as in the setIssue student then, only they can return
				if (tobeReturned.getIssuedTo() == studentName) {
					tobeReturned.setIssue(false);
					tobeReturned.setIssuedTo(null);
					System.out.println("\nBook Returned Successfully"); 
				}
				else {
			     	System.out.println("You cannot Return Book as this book not issued to you");
				}
			}
			else  System.out.println("\nBook is not issued yet"); 
		}
		else System.out.println("\nBook with "+bookId+" not found for Return");
	}
}
