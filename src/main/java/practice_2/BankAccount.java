package practice_2;

import org.w3c.dom.ls.LSOutput;

public class BankAccount {
    String owner;
    double balance;

    BankAccount(String someOwner, double someBalance) {
        this.owner = someOwner;
        this.balance = someBalance;
    }

    String getOwner() {
        return this.owner;
    }

    double getBalance() {
        return this.balance;
    }

    void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void printBalance() {
        System.out.println("Current balance: " + balance);
    }
}
