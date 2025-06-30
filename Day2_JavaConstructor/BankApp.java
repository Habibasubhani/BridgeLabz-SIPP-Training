package LocalRepo.Day2_JavaConstructor;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        System.out.println("Accessing Account Number: " + accountNumber);
        System.out.println("Accessing Account Holder: " + accountHolder);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("SB123456", "Anjali", 12000.50);
        b1.displayAccountDetails();
        System.out.println();

        b1.setBalance(15000.75);
        System.out.println("Updated Balance: " + b1.getBalance());
        System.out.println();

        SavingsAccount s1 = new SavingsAccount("SB789012", "Rohit", 20000.00, 4.5);
        s1.displaySavingsDetails();
        System.out.println();

        s1.displayAccountDetails();
    }
}

