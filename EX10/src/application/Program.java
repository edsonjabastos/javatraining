package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroPessoas, numeroMenores16;
		double somaAltura, mediaAltura, percentualMenores;
		System.out.print("Quantas pessoas serão registradas? ");
		numeroPessoas = sc.nextInt();
		sc.nextLine();
		Pessoa[] pessoas = new Pessoa[numeroPessoas];
		for (int i = 0; i < pessoas.length; i++) {
			System.out.printf("Dados da %dª pessoa: ", i + 1);
			System.out.println();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			// System.out.println();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			float altura = sc.nextFloat();
			sc.nextLine();
			pessoas[i] = new Pessoa(nome, idade, altura);
		}
		numeroMenores16 = 0;
		somaAltura = 0.0;
		mediaAltura = 0.0;
		percentualMenores = 0.0;

		for (int i = 0; i < pessoas.length; i++) {
			somaAltura += pessoas[i].getAltura();
			if (pessoas[i].getIdade() < 16) {
				numeroMenores16 += 1;
			}
		}
		mediaAltura = somaAltura / pessoas.length;
		System.out.printf("Altura média: %.2f%n", mediaAltura);
		percentualMenores = ((double) numeroMenores16 / pessoas.length) * 100.0;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getIdade() < 16) {
				System.out.println(pessoas[i].getNome());
			}
		}
		sc.close();
	}

}
