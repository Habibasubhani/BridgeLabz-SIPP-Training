package LocalRepo.Day4_ObjectModelling;

import java.util.*;

class Bank {
    String bankName;
    List<Customer> customers;

    Bank(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }

    void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println("Account opened for " + customer.name + " at " + bankName);
    }

    void listCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (Customer c : customers) {
            System.out.println("- " + c.name);
        }
        System.out.println();
    }
}

class Customer {
    String name;
    Map<Bank, Double> accounts;

    Customer(String name) {
        this.name = name;
        accounts = new HashMap<>();
    }

    void addAccount(Bank bank, double balance) {
        accounts.put(bank, balance);
        bank.openAccount(this); // establish the association
    }

    void viewBalance() {
        System.out.println("Account Balances for " + name + ":");
        for (Map.Entry<Bank, Double> entry : accounts.entrySet()) {
            System.out.println("- " + entry.getKey().bankName + ": ₹" + entry.getValue());
        }
        System.out.println();
    }
}

public class BankAssociationApp {
    public static void main(String[] args) {
        Bank b1 = new Bank("HDFC Bank");
        Bank b2 = new Bank("SBI Bank");

        Customer c1 = new Customer("Riya");
        Customer c2 = new Customer("Aman");

        c1.addAccount(b1, 15000.0);
        c1.addAccount(b2, 8000.0);

        c2.addAccount(b1, 12000.0);

        c1.viewBalance();
        c2.viewBalance();

        b1.listCustomers();
        b2.listCustomers();
    }
}

