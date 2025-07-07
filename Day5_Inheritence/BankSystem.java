package LocalRepo.Day5_Inheritence;


class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}


class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        displayAccountType();
    }
}


class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        displayAccountType();
    }
}

class FixedDepositAccount extends BankAccount {
    int depositTerm; 

    FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Term: " + depositTerm + " months");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        displayAccountType();
    }
}


public class BankSystem {
    public static void main(String[] args) {

        System.out.println("----- Savings Account -----");
        SavingsAccount savings = new SavingsAccount("SAV123", 25000, 3.5);
        savings.displayInfo();

        System.out.println("\n----- Checking Account -----");
        CheckingAccount checking = new CheckingAccount("CHK456", 15000, 5000);
        checking.displayInfo();

        System.out.println("\n----- Fixed Deposit Account -----");
        FixedDepositAccount fd = new FixedDepositAccount("FD789", 100000, 12);
        fd.displayInfo();
    }
}

