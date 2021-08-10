package entities;

import java.util.Scanner;

public class Account {
    private int accountNumber;
    private String accountHolder;
    private Double balance;

    Scanner sc = new Scanner(System.in);

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.00;
    }

    public void AccountDate(){
        System.out.println("Account data: ");
        System.out.print("Account "+ getAccountNumber() + ", Holder: "+ accountHolder + ", ");
        System.out.printf("Balance $ %.2f%n", getBalance());
    }

    public void Deposit(){
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        setBalance(getBalance()+deposit);
        System.out.println("Updated account data: ");
        System.out.print("Account "+ getAccountNumber() + ", Holder: "+ accountHolder + ", ");
        System.out.printf("Balance $ %.2f%n", getBalance());
    }

    public void Withdraw(){
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        setBalance(((getBalance()-withdraw)-5));
        System.out.println("Updated account data: ");
        System.out.print("Account "+ getAccountNumber() + ", Holder: "+ accountHolder + ", ");
        System.out.printf("Balance $ %.2f%n", getBalance());
    }
    sc.close();
}
