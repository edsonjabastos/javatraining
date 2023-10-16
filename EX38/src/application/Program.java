package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import domain.entities.Account;
import domain.exceptions.DomainException;

public class Program {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Account account = null;
        // try {
        //     System.out.println("Enter account data");
        //     System.out.print("Number: ");
        //     int number = sc.nextInt();
        //     sc.nextLine();
        //     System.out.print("Holder: ");
        //     String name = sc.nextLine();
        //     System.out.print("Initial balance: ");
        //     double balance = sc.nextDouble();
        //     System.out.print("Withdraw limit: ");
        //     double withdrawLimit = sc.nextDouble();
        //     account = new Account(number, name, balance, withdrawLimit);
        //     System.out.println();
        //     System.out.print("Enter amount for withdraw: ");
        //     double withdraw = sc.nextDouble();
        //     account.withdraw(withdraw);
        // } catch (DomainException e) {
        //     System.out.println("Withdraw error: " + e.getMessage());
        // } catch (RuntimeException e) {
        //     System.out.println("Unexpected error");
        // } finally {
        //     System.out.print("Final balance: " + account.getBalance());
        // }
        //generate a print listing account data
        // System.out.println("Account data: " + account.toString());
        //generate a butterfly ascii art
        System.out.println("  .--.  ");
        System.out.println(" |o_o | ");
        System.out.println(" |:_/ | ");
        System.out.println(" //   \\ \\ ");
        System.out.println(" (|     | ) ");
        System.out.println(" /'\\_   _/`\\ ");
        System.out.println(" \\___)=(___/ ");
        //draw a dog ascii art
        System.out.println("  __      _");
        System.out.println("o'')}____//");
        System.out.println(" `_/      )");
        System.out.println(" (_(_/-(_/");


        sc.close();
    }
}
