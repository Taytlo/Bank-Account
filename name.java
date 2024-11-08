
    public class BankAccount {
    
    private double balance;
    private boolean loggedIn;
    private String accountName;
    private String accountNumber;
    private String accountType;
    
    public BankAccount(String accountName, String accountNumber, String accountType) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0.0;
        this.loggedIn = false;
    }

    public double getBalance() {
        if (loggedIn) {
            return balance;
        } else {
            System.out.println("Login to view your balance.");
        }
    }

    public void deposit(double amount) {
        if (loggedIn) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited " + amount + ". New balance: " + balance);
            } 
        } else {
            System.out.println("You must be logged in to deposit money.");
        }
    }
    
    public void withdraw(double amount) {
        if (loggedIn) {
            if (amount > 0 & balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew " + amount + ". New balance: " + balance);
            } else if (amount > balance) {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("You must be logged in to withdraw money.");
        }
    }

    public void login() {
        loggedIn = true;
        System.out.println(accountName + " logged in.");
    }
    
    public void logout() {
        loggedIn = false;
        System.out.println(accountName + " logged out.");
    }
}

