package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDateStr = sc.nextLine();
		LocalDate birthDate = LocalDate.parse(birthDateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("How many items to this order? ");
		Integer itensQttyToBuy = sc.nextInt();
		sc.nextLine();

		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
		for (int i = 0; i < itensQttyToBuy; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			sc.nextLine();
			Product product = new Product(productName, productPrice);
			System.out.print("Quantity: ");
			Integer itemQtty = sc.nextInt();
			sc.nextLine();
			OrderItem orderItem = new OrderItem(itemQtty, product);
			order.addItem(orderItem);
		}
		System.out.println();
		System.out.print(order);
		sc.close();
	}

}
