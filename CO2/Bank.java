// Class representing a Bank Account
class BankAccount {
    static int accountCount = 0; // Static variable to count accounts

    String name;      // Account holder name
    int accNumber;    // Unique account number
    double balance;   // Account balance

    // Constructor to create a new account
    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        accNumber = ++accountCount; // Increment and assign account number
    }

    // Method to withdraw money
    boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount; // Deduct amount
            return true;
        }
        return false; // Not enough balance
    }

    // Method to deposit money
    void deposit(double amount) {
        balance += amount; // Add amount
    }

    // Method to transfer money and return a Transaction object
    Transaction transfer(BankAccount receiver, double amount) {
        if (this.withdraw(amount)) {       // Withdraw from sender
            receiver.deposit(amount);      // Deposit to receiver
            return new Transaction(this, receiver, amount, "Success");
        } else {
            return new Transaction(this, receiver, amount, "Failed");
        }
    }
}

// Class to represent a transaction
class Transaction {
    BankAccount sender;
    BankAccount receiver;
    double amount;
    String status;

    // Constructor to store transaction details
    Transaction(BankAccount s, BankAccount r, double a, String st) {
        sender = s;
        receiver = r;
        amount = a;
        status = st;
    }

    // Print transaction info
    void showDetails() {
        System.out.println("Transaction Details:");
        System.out.println("From   : " + sender.name + " (Acc No: " + sender.accNumber + ")");
        System.out.println("To     : " + receiver.name + " (Acc No: " + receiver.accNumber + ")");
        System.out.println("Amount : " + amount);
        System.out.println("Status : " + status + "\n");
    }
}

// Main class to test everything
public class Bank {
    public static void main(String[] args) {
        // Create two bank accounts
        BankAccount acc1 = new BankAccount("Alice", 2000);
        BankAccount acc2 = new BankAccount("Bob", 1000);

        // Transfer ₹500 from Alice to Bob
        Transaction t1 = acc1.transfer(acc2, 500);
        t1.showDetails();

        // Try to transfer ₹2000 (should fail)
        Transaction t2 = acc1.transfer(acc2, 2000);
        t2.showDetails();

        // Print final balances
        System.out.println("Final Balances:");
        System.out.println(acc1.name + ": ₹" + acc1.balance);
        System.out.println(acc2.name + ": ₹" + acc2.balance);

        // Print total number of accounts
        System.out.println("Total Bank Accounts: " + BankAccount.accountCount);
    }
}
