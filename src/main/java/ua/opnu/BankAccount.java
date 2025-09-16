package ua.opnu;

public class BankAccount {
    public String name;
    public double balance;
    public double transactionFee = 0.0;

    public BankAccount() {
        this.name = "";
        this.balance = 0.0;
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= (amount + transactionFee)) {
            balance -= (amount + transactionFee);
            return true;
        }
        return false;
    }

    public boolean transfer(BankAccount receiver, double amount) {
        if (amount > 0 && balance >= (amount + transactionFee)) {
            balance -= (amount + transactionFee);
            receiver.deposit(amount);
            return true;
        }
        return false;
    }
}
