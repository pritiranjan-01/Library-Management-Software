package com.library.classes;

import java.util.List;

public class StudentFunctionality {
	public static void studentOperation() {
		
		System.out.println("\n  Logged into Student Portal 🧑🏻‍🎓 ");
		List<Student> students =  Library.getLibrary().getStudents();
		
		String s=UserInput.getLine("Enter your Student ID: ");
		int id = Integer.parseInt(s);
		if(s.isEmpty()) {
			System.out.println("Student ID cannot be empty");
			return;
		}
		
		String currentStudent = null;
		
		for(Student str : students) {
			if(str.getId() == id) {
				currentStudent = str.getName();
				System.out.println("\nWelcome " + currentStudent);
				break;
			}
		}
		
		while(true) {
			System.out.println( "\n1. View all Books\n"
			         + "2. Issue Book\n"
					 + "3. Return Book\n"
					 + "4. Search Book\n"
			         + "5. Return to Main Menu");
			System.out.println("\nChoose from the above Options");
			
			int choice = UserInput.userChoice();
			switch(choice) {
				case 1: Student.displayBooks();
						break;
				case 2: Student.studentIssueBook(UserInput.issueBook(),currentStudent);
						break;
				case 3: Student.studentReturnBook(UserInput.issueBook(),currentStudent);
						break;
				case 4: AdminFunctionality.admin.searchBook();  //  For AdminFunctionality class admin is a static variable,
						break;  // of type Admin, which is initialized in the adminOperations method. and as it is initialised,
								// this object reference carries the behaviour and states of his own (Admin) class and by using this object reference we are accessing the non static methods
				case 5: return; 
				default : System.out.println("Invalid Choice");			
			}
		}
	}
}
