package program;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        String answer = sc.next();

        if (answer.equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit value: ");
            Double balance = sc.nextDouble();
            Account account = new Account(accountNumber, accountHolder, balance);
            System.out.println(" ");
            account.AccountDate();
            System.out.println(" ");
            account.Deposit();
            System.out.println(" ");
            account.Withdraw();
        } else {
            Account account = new Account(accountNumber, accountHolder);
            System.out.println(" ");
            account.AccountDate();
            System.out.println(" ");
            account.Deposit();
            System.out.println(" ");
            account.Withdraw();
        }
        sc.close();
    }
}
