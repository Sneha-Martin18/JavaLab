// Abstract class - Abstraction
abstract class BankAccount {
    private double balance;  // Encapsulation

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Getter and Setter - Encapsulation
    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Abstract methods - must be implemented in subclasses
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Display balance
    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Subclass - SavingsAccount
class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("₹" + amount + " deposited to Savings Account.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("₹" + amount + " withdrawn from Savings Account.");
        } else {
            System.out.println("Insufficient funds in Savings Account.");
        }
    }
}

// Subclass - CurrentAccount
class CurrentAccount extends BankAccount {
    private double overdraftLimit = 1000;  // Extra feature for current accounts

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("₹" + amount + " deposited to Current Account.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {
            setBalance(getBalance() - amount);
            System.out.println("₹" + amount + " withdrawn from Current Account.");
        } else {
            System.out.println("Withdrawal exceeds overdraft limit in Current Account.");
        }
    }
}

// Main class to test
public class Bank{
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(5000);
        CurrentAccount current = new CurrentAccount(2000);

        System.out.println("--- Savings Account ---");
        savings.deposit(1500);
        savings.withdraw(2000);
        savings.displayBalance();

        System.out.println("\n--- Current Account ---");
        current.deposit(1000);
        current.withdraw(3500);  // Should be allowed with overdraft
        current.displayBalance();
    }
}
