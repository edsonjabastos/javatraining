package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    Account account;
	    System.out.print("Enter account number: ");
	    int accountNumber = sc.nextInt();
	    sc.nextLine(); // Consume the newline character

	    System.out.print("Enter account holder: ");
	    String name = sc.nextLine();

	    System.out.print("Is there an initial deposit (y/n)? ");
	    String hasInitialDeposit = sc.nextLine();
	    
	    if (hasInitialDeposit.equals("y")) { // Use .equals() to compare strings
	        System.out.print("Enter initial deposit value: ");
	        double value = sc.nextDouble();
	        account = new Account(accountNumber, name, value);
	    } else {
	        account = new Account(accountNumber, name);
	    }
	    
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.addBalance(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.removeBalance(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);
	    sc.close();
	}


}
