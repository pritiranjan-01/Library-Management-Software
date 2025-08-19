package com.library.classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
  static Scanner scanner = new Scanner(System.in);
	
	static int getbookId() {
		System.out.println("\nPlease Enter the book Id to delete");
		return getIntInput();
	}
	
	//Handled Exception
	static Book inputBook() {
	    int id = 0;
	    String bookName = "";
	    String authorName = "";
	    BookCategory bookCategory = null;

	    while (true) {
	        try {
	            System.out.print("\nPlease Enter the Book ID: ");
	            id = scanner.nextInt();
	            scanner.nextLine(); // clear newline after int input
	            if (Library.getLibrary().getBookbyId(id) != null) {
	                System.out.println("A book with ID "+id+" already exists. Please enter a different ID.");
	            } else {
	                break; // valid and unique ID
	            }
	        } catch (Exception e) {
	            System.out.println("❌ Invalid input. Book ID must be a number.");
	            scanner.nextLine(); // clear the invalid input
	        }
	    }

	    while (true) {
	        System.out.print("Please Enter the Book Name: ");
	        bookName = scanner.nextLine();
	        if (!bookName.trim().isEmpty()) {
	            break;
	        } else {
	            System.out.println("❌ Book name cannot be empty.");
	        }
	    }

	    while (true) {
	        System.out.print("Please Enter the Book Author: ");
	        authorName = scanner.nextLine();
	        if (!authorName.trim().isEmpty()) {
	            break;
	        } else {
	            System.out.println("❌ Author name cannot be empty.");
	        }
	    }
	    
	    while(true) {
	    	System.out.println("Please Select from the below Categories: ");
	    	for(BookCategory category : BookCategory.values()) {
	    		System.out.print(category+" ");
	    	}
	    	
	    	System.out.println("\n\nEnter the Category: ");
	    	String categoryInput = scanner.nextLine().toUpperCase();
	    	try {
	    		bookCategory = BookCategory.valueOf(categoryInput);
	    		break; // valid category selected
	    	} catch (IllegalArgumentException e) {
	    		System.out.println("❌ Invalid category. Please select a valid category from the list.\n");
	    	}
	    }
	    return new Book(id, bookName, authorName, bookCategory);
	}
	
	static int userChoice() {
		return getIntInput();
	}
	
	static int issueBook() {
		System.out.println("Enter the book Id");
		return getIntInput();
	}
	
	// 🔄 Common method to safely get int input
    public static int getIntInput() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input. Please enter a valid number:");
                scanner.nextLine(); // clear invalid input
            }
        }
    }
    
    static String getLine(String s) {
    	System.out.println(s);
    	return scanner.next();
   }
    
    static String getNextLine(String s) {
    	scanner.nextLine(); // this will consume the left over space in the buffer then actual input will taken
    	System.out.println(s);
    	return scanner.nextLine();
    }
}
