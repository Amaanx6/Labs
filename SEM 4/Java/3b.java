3 b) Write a Java program to implement the concept of exception handling.

import java.util.*;
class CheckWeight {

    // Method to validate the weight and throw the custom exception
public static void validateWeight(int weight) throws InvalidWeight {
        if (weight > 100) {
            throw new InvalidWeight("Exception caught: "+weight+" is invalid weight");
        }
	else 
			System.out.println(weight+" is the valid weight");
    }

    // Main method to test the validWeight method
	 public static void main(String[] args) {
		 

        // Create an instance of CheckWeight class
CheckWeight Ck=new CheckWeight();
        // Create a Scanner object to read input
Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the weight
System.out.print("Enter weight: ");
        // Read the weight from the user
int weight = scanner.nextInt();
            // Call the validWeight method and handle the custom exception
		 try {
            // Validate the weight
            validateWeight(weight);
        } 
            // Catch and handle the InvalidWeight exception
 catch (InvalidWeight e) {
            
            System.out.println(e.getMessage());
        }
        scanner.close();
	
}
}
// Define a user-defined exception named InvalidWeight
class InvalidWeight extends Exception {
public InvalidWeight(String message) {
        super(message);
    }
}

