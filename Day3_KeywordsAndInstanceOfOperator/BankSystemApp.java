package LocalRepo.Day3_KeywordsAndInstanceOfOperator;

class BankAccount {
    static String bankName = "National Bank";
    static int totalAccounts = 0;

    final String accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class BankSystemApp {
    public static void main(String[] args) {
        Object obj1 = new BankAccount("ACC1001", "Aman", 15000.0);
        Object obj2 = new BankAccount("ACC1002", "Sana", 23000.0);

        if (obj1 instanceof BankAccount) {
            BankAccount acc1 = (BankAccount) obj1;
            acc1.displayAccountDetails();
            System.out.println();
        }

        if (obj2 instanceof BankAccount) {
            BankAccount acc2 = (BankAccount) obj2;
            acc2.displayAccountDetails();
            System.out.println();
        }

        BankAccount.getTotalAccounts();
    }
}

