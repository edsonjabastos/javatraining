package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quantidadeQuartos = 10;
		int quantidadeQuartosAlugados, quarto;
		String nome, email;
		System.out.print("Quantos quartos vão ser alugados? ");
		quantidadeQuartosAlugados = sc.nextInt();
		sc.nextLine();
		Pessoa[] quartos = new Pessoa[quantidadeQuartos];

		for (int i = 0; i < quantidadeQuartosAlugados; i++) {
			System.out.printf("Rent #%d:%n", i + 1);
			System.out.print("Name: ");
			nome = sc.nextLine();
			System.out.print("E-mail: ");
			email = sc.nextLine();
			System.out.print("Quarto: ");
			quarto = sc.nextInt();
			sc.nextLine();
			quartos[quarto] = new Pessoa(nome, email);
		}
		System.out.println("Busy rooms: ");
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.print(i + ": " + quartos[i].getNome() + ", " + quartos[i].getNome() + "\n");
			}
		}
		sc.close();
	}
}
