package com.library.classes;

import java.util.*;

public class Library {
	
	static Library library;
	private List<Book> books = new ArrayList<>();
	private List <Student> students = new ArrayList<>();
	
	private Library() {
		books.add(new Book(1, "Atomic Habits", "James Clear", BookCategory.BIOGRAPHY));
		books.add(new Book(2, "Wings of Fire", "A. P. J. Abdul Kalam", BookCategory.BIOGRAPHY));
		books.add(new Book(3, "Effective Java", "Joshua Bloch", BookCategory.PROGRAMMING));
		books.add(new Book(4, "A Brief History of Time", "Stephen Hawking", BookCategory.SCIENCE));
		books.add(new Book(5, "The Alchemist", "Paulo Coelho", BookCategory.OTHER));

		
		students.add(new Student("Aarav", 10));
		students.add(new Student("Meera", 20));
	}
	
	public static Library getLibrary() {
	   if(library == null) {
		    library = new Library();
	   }
	   return library;
	}
	
	public void addBook(Book b1) {
		books.add(b1);
		System.out.println("\n✅ Book Added Successfully\n");
	}
	
	public void deleteBook(int bookId) {
		Book todelete=null;
		for(Book b : books) {
			if(b.getBookId() == bookId) {
			    todelete = b;
			}
		}
		
		if(todelete != null) {
			books.remove(todelete);
	    	System.out.println("\nBook Deleted Successfully ✅\n");
		}
		
		else System.out.println("\nBook with Id "+bookId+" was not found ❌\n");
    }
	
	public void showBooks() {
		if(books.isEmpty()) {
			System.out.println("\nNo Books Available in the Library ❌\n");
			return;
		}
		System.out.println("\nThe following books are currently available in the library:\n");
		for(Book b : books) {
			System.out.println(b);
		}
	}
		
//  to issue a book we need the book Id / the book itself for issuing
	public Book getBookbyId(int id) {
		Book foundBook=null;
		for(Book b : books) {
			if(b.getBookId() == id) {
				foundBook = b;
			}
		}
		return foundBook;
	}
	
	public void updateBookTitle(Book book,String newTitle) {
		book.setTitle(newTitle);
		System.out.println("Book Updated Successfully");
	}
	
	public void updateBookAuthor(Book book,String newAuther) {
		book.setAuther(newAuther);
		System.out.println("Book Updated Successfully");
	}
	
	public void searchBookById(int bookid) {
		Book book = library.getBookbyId(bookid);
		if(book !=null)
		   System.out.println("Found Book "+book);
		else
			System.out.printf("Book not found with Book ID %d ",bookid);
	}	
	
	public void searchBookByName(String name) {
		for(Book b: books) {
			if(b.getTitle().equalsIgnoreCase(name)) { // equalsIgnoreCase returns boolean when the String matched.
				System.out.print("Found Book : ");
				System.out.println(b);
				return;
			}
		}
	  System.out.println("Book not Found");
	}
	
	public void searchBookByAuthor(String author) {
		List <Book> foundBooks = new ArrayList<>();
		for(Book b :books) {
		    if(b.getAuther().toLowerCase().contains(author.toLowerCase())) {
			   foundBooks.add(b);
			}
		}
		
	    if (foundBooks.isEmpty())
	        System.out.println("No books found.");
	    
	    else {
	        System.out.println("Found books:");
	         for (Book b : foundBooks) {
	            System.out.println(b);
	        }
	    }
    }
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void searchBookByCategory(BookCategory category) {
		List<Book> foundBooks = new ArrayList<>();
		for (Book b : books) {
			if (b.getBookCategory() == category) {
				foundBooks.add(b);
			}
		}

		if (foundBooks.isEmpty()) {
			System.out.println("No books found in this category.");
		} else {
			System.out.println("Found books in " + category + " category:");
			for (Book b : foundBooks) {
				System.out.println(b);
			}
		}
	}

	public void viewStudent() {
		System.out.println("The following Students present inside Library : ");	
		for(Student s: students) {
				System.out.println("  "+s);
		}
	}
}

