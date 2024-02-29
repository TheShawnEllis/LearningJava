// A package in Java is used to group related classes. Think of it as a folder in a file directory. 
// We use packages to avoid name conflicts, and to write a better maintainable code. 
// Packages are divided into two categories:
    //Built-in Packages (packages from the Java API) are prewritten classes included in the JDE
    //User-defined Packages (create your own packages)

// Import package sytax
    //import package.name.Class;   // Import a single class
    //import package.name.*;   // Import the whole package

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // The Scanner class is used to get user input
        Scanner scanner = new Scanner(System.in);

        // Get a string from the user
        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        
        // To get an int from the user, declare an int variable
            // Warning: nextInt() does not clear the way for a new line fo user input.
        System.out.println("What is your age?");
        int userAge = scanner.nextInt();
        scanner.nextLine(); // Adding this to clear the new line carrige left by nextInt() 

        // Getting user input after nextInt() will fail because "\n" is left in the scanner. It must be cleared.
        System.out.println("What is your fav food?");
        String favFood = scanner.nextLine();

        System.out.println("Hello " + userName);
        System.out.println("You are " + userAge + " years old.");
        System.out.println("Your favorite food is: " + favFood);
    }   
}
