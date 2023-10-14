package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		// System.out.print("Enter the number of tax payers: ");
		// int n = sc.nextInt();
		// sc.nextLine();
		// for (int i = 0; i < n; i++) {
		// System.out.printf("Tax payer #%d data:%n", i + 1);
		// System.out.print("Individual or company (i/c)? ");
		// char c = sc.next().charAt(0);
		// sc.nextLine();
		// System.out.print("Name: ");
		// String name = sc.nextLine();
		// System.out.print("Anual income: ");
		// Double income = sc.nextDouble();
		// sc.nextLine();
		// if (c == 'c') {
		// System.out.print("Number of employees: ");
		// int numberOfEmployees = sc.nextInt();
		// sc.nextLine();
		// list.add(new Company(name, income, numberOfEmployees));
		// } else {
		// System.out.print("Health expenditures: ");
		// double numberOfEmployees = sc.nextInt();
		// sc.nextLine();
		// list.add(new Individual(name, income, numberOfEmployees));
		// }
		// }

		list.add(new Individual("Alex", 50000.00, 2000.00));
		list.add(new Company("SoftTech", 400000.00, 25));
		list.add(new Individual("Bob", 120000.00, 1000.00));

		for (TaxPayer contributor : list) {
			System.out.println(contributor);
		}
		double total = 0;
		for (TaxPayer contributor : list) {
			total += contributor.tax();
		}
		System.out.printf("TOTAL TAXES: $%.2f", total);
		sc.close();
	}
}
