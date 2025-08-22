package com.library.classes;

public class Admin {
	Library library;
	
	public Admin(Library library ) {
		this.library=library;
	}
	
	void addBook() {
		Book book = UserInput.inputBook();
		library.addBook(book);
	}
	
	void deleteBook() {
		int bookId = UserInput.getbookId();
		library.deleteBook(bookId);
	}
	
	void showBooks() {
		library.showBooks();
	}
	
	void updateBook() {
		String x = UserInput.getLine("Enter the book ID to modify");
		int bookId= Integer.parseInt(x);
		Book book = null;
		book = Library.getLibrary().getBookbyId(bookId);
		
		if(book == null) {
			System.out.printf("\nBook with ID %d is not found",bookId);
			return;
		}
		System.out.println("\nBook selected for modification is : "+  book.getTitle()+"Auther: "+book.getAuther());
		System.out.println("\n--- Update Book Menu ---");
        System.out.println("1. Update Title\n"
        				  +"2. Update Author\n"
        				  +"3. Return to Previous Menu");
        
    	String s = UserInput.getLine(" > Choose from the above option: ");
    	int choice = Integer.parseInt(s);
    	
    	switch (choice){
    	   case 1 : 
    		   String newTitle = UserInput.getLine("Enter the new Title for the selected Book : ");
    	   	   library.updateBookTitle(book, newTitle);
    	   	   break;
    	   	   
    	   case 2 : 
    		   String newAuthor = UserInput.getLine("Enter the new Author for the selected Book: "); 
    		   library.updateBookTitle(book, newAuthor);
    		   break;
    	   
    	   case 3 : return; 
    	}
    			
	}
	
	public void searchBook() {
	  while(true) 
	  {
		System.out.println("\nSearch Book by\n"
							+ "   1. ID\n"
							+ "   2. Name\n"
							+ "   3. Author\n"
							+ "   4. Category\n\n"
							+ "Press 0 to return to Previous Menu\n");
		
		int choice = Integer.parseInt(UserInput.getLine("  > Select from above option:   "));
		
		switch (choice) {
			case 1: 
				int bookid= Integer.parseInt(UserInput.getLine("Enter the Book ID"));
				library.searchBookById(bookid);
				break;
			
			case 2: 
				String bookname =  UserInput.getNextLine("Enter the Book name");
				library.searchBookByName(bookname);
				break;	
				
			case 3: 
				String author = UserInput.getNextLine("Enter the Author Name");
				library.searchBookByAuthor(author);
				break;
			case 4: 
				for(BookCategory category : BookCategory.values()) {
					System.out.print(category+" ");
				}
				BookCategory categoryChoosed;
				String category = UserInput.getNextLine("\nEnter the Book Category").toUpperCase();
				try {
					categoryChoosed=BookCategory.valueOf(category); // Validate if the category exists
				
				} catch (IllegalArgumentException e) {
					System.out.println("Invalid category. Please try again.");
					continue; // Skip to the next iteration if invalid
				}
				library.searchBookByCategory(categoryChoosed);
				break;
			
			case 0: return;
		  }	
	   }
    }
	
	public void viewAllStudent() {	
		library.viewStudent();	
	}
}

