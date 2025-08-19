package com.library.classes;

public class MainClass {

    public static void main(String[] args) {
    	System.out.println("\n============= Welcome to Library Management Software =============\n");
        startApp();
    }

    public static void startApp() {
        while (true) {
            System.out.println("Choose your Role: \n"
                    + "1. Admin\n"
                    + "2. Student\n"
                    + "0. Exit");

            System.out.println("\n> Enter your choice: ");
            int user = UserInput.userChoice();

            switch (user) {
                case 1:
                    AdminFunctionality.adminOperations();
                    break;
                case 2:
                    StudentFunctionality.studentOperation();
                    break;
                case 0:
                    System.out.println("Thanks for using Library Software! 👋");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
