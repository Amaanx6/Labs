// 4.	Write a Java program to illustrate the concept of Thread synchronization.
package q18198;
import java.util.Scanner;

class TablePrinter implements Runnable {
    private int tableNumber;

    public TablePrinter(int tableNumber) {
        this.tableNumber = tableNumber;
    }

   
   //write your code....
   public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                // Print the multiplication result for this table number
                System.out.println( + tableNumber + " * " + i + " = " + (tableNumber * i));
                // Sleep for 100 milliseconds to add a small delay
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

   
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of tables:");
        int numTables = scanner.nextInt();
        Thread[] threads = new Thread[numTables];
     
        
    //write your code....    
		for (int i = 1; i <= numTables; i++) {
            TablePrinter tablePrinter = new TablePrinter(i);  // Create a new TablePrinter for table i
            threads[i - 1] = new Thread(tablePrinter);  // Assign the thread to the array
            threads[i - 1].start();  // Start the thread
        }
		try {
            for (int i = 0; i < numTables; i++) {
                threads[i].join();  // Wait for each thread to finish
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
		scanner.close();
        
    }
}

// Output:
// Enter the number of tables:1
// 1 * 1 = 1
// 1 * 2 = 2
// 1 * 3 = 3
// 1 * 4 = 4
// 1 * 5 = 5
// 1 * 6 = 6
// 1 * 7 = 7
// 1 * 8 = 8
// 1 * 9 = 9
// 1	* 10 = 10


// ✏️ Shortened Java Code PAPER

import java.util.*;

class TablePrinter implements Runnable {
    int n;
    TablePrinter(int n) { this.n = n; }

    public synchronized void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
            try { Thread.sleep(100); } catch (Exception e) {}
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Thread[] threads = new Thread[t];
        for (int i = 0; i < t; i++) {
            threads[i] = new Thread(new TablePrinter(i + 1));
            threads[i].start();
        }
        for (Thread thread : threads) thread.join();
        sc.close();
    }
}


// CODE FOR ONLINE JUDGE 

import java.util.Scanner;

class TablePrinter implements Runnable {
    private int tableNumber;

    public TablePrinter(int tableNumber) {
        this.tableNumber = tableNumber;
    }


    //write your code....
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                // Print the multiplication result for this table number
                System.out.println(+tableNumber + " * " + i + " = " + (tableNumber * i));
                // Sleep for 100 milliseconds to add a small delay
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }


}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of tables:");
        int numTables = scanner.nextInt();
        Thread[] threads = new Thread[numTables];


        //write your code....    
        for (int i = 1; i <= numTables; i++) {
            TablePrinter tablePrinter = new TablePrinter(i); // Create a new TablePrinter for table i
            threads[i - 1] = new Thread(tablePrinter); // Assign the thread to the array
            threads[i - 1].start(); // Start the thread
        }
        try {
            for (int i = 0; i < numTables; i++) {
                threads[i].join(); // Wait for each thread to finish
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        scanner.close();

    }
}

