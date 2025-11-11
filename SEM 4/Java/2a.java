// 2.a) Write a Java program to illustrate the concept of Single level and Multi level Inheritance.
// Base class: Bank
class Bank {
    // Property of the Bank class
    String bankName;

    // Constructor to initialize bank name
    public Bank(String bankName) {
        this.bankName = bankName;
    }

    // Method to display bank information
    public void displayBankInfo() {
        System.out.println("Bank Name: " + bankName);
    }
}

// Single Level Inheritance: SavingsAccount is a subclass of Bank
class SavingsAccount extends Bank {
    // Property of SavingsAccount class
    double balance;

    // Constructor to initialize SavingsAccount with balance and bank name
    public SavingsAccount(String bankName, double balance) {
        super(bankName); // Call the parent (Bank) constructor
        this.balance = balance;
    }

    // Method to display savings account balance
    public void displayBalance() {
        System.out.println("Savings Account Balance: $" + balance);
    }

    // Method to deposit money into savings account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into Savings Account.");
    }
}

// Multi-Level Inheritance: CheckingAccount is a subclass of SavingsAccount
class CheckingAccount extends SavingsAccount {
    // Property of CheckingAccount class
    double overdraftLimit;

    // Constructor to initialize CheckingAccount with overdraft limit and balance
    public CheckingAccount(String bankName, double balance, double overdraftLimit) {
        super(bankName, balance); // Call the parent (SavingsAccount) constructor
        this.overdraftLimit = overdraftLimit;
    }

    // Method to display checking account info including overdraft limit
    public void displayCheckingInfo() {
        System.out.println("Checking Account Balance: $" + balance);
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }

    // Method to withdraw money from checking account (with overdraft protection)
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Checking Account.");
        } else {
            System.out.println("Insufficient funds. Cannot withdraw more than available balance + overdraft limit.");
        }
    }
}

// Main class to test the inheritance
public class Main2 {
    public static void main(String[] args) {
        // Single level inheritance: SavingsAccount object
        System.out.println("---- Savings Account ----");
        SavingsAccount savings = new SavingsAccount("City Bank", 5000);
        savings.displayBankInfo();      // Inherited from Bank
        savings.displayBalance();       // Own method
        savings.deposit(1500);          // Own method
        savings.displayBalance();       // Check updated balance

        // Multi-level inheritance: CheckingAccount object
        System.out.println("\n---- Checking Account ----");
        CheckingAccount checking = new CheckingAccount("City Bank", 3000, 500);
        checking.displayBankInfo();     // Inherited from Bank
        checking.displayCheckingInfo(); // Own method
        checking.withdraw(3500);        // Withdraw with overdraft
        checking.displayCheckingInfo(); // Check updated info
    }
}

