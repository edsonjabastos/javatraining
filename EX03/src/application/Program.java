package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantityInStock = sc.nextInt();
		Product product = new Product(name, price, quantityInStock);
		product.setName("Carrinho de Pipoca");
		product.setPrice(420.00);
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantityAdded = sc.nextInt();
		product.addProducts(quantityAdded);
		product.setName("Mic-Mic");
		product.setPrice(69.69);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		int quantityRemoved = sc.nextInt();
		product.removeProducts(quantityRemoved);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}
}