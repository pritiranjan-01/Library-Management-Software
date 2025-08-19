package com.library.classes;

public class AdminFunctionality {
	static Admin admin;
	
	public static void adminOperations() {
		admin = new Admin(Library.getLibrary());
		
		System.out.println("\n Logged in as Admin 👮🏻");
		while(true) {
			System.out.println("\n Select from the below Menu :");
			System.out.printf("%n%s %n%s %n%s %n%s %n%s %n %n%s %n",
				    "1. View All Books",
				    "2. Add a Book",
				    "3. Delete a Book",
				    "4. Update a Book",
				    "5. Search Book ",
				    "Press 0 return Main Menu ");
			System.out.println("\n  > Enter your choice: ");
			
			int choice = UserInput.userChoice();
			
			switch(choice) {
			case 1: admin.showBooks();
					break;
			case 2: admin.addBook();
					break;
			case 3: admin.deleteBook();
					break;
			case 4: admin.updateBook();
					break;
			case 5: admin.searchBook();
					break;
			case 0: return;
			
			default : System.out.println("Invalid Choice");
					break;
			}			
		}
	}
}
