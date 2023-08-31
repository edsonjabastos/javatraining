package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números vai digitar? ");
		int quantidadeNumeros = sc.nextInt();
		double[] vetor = new double[quantidadeNumeros];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			double numero = sc.nextDouble();
			vetor[i] = numero;
		}
		System.out.print("VALORES = ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(" " + vetor[i] + " ");
		}
		System.out.println();
		double sum = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			sum += vetor[i];
		}
		System.out.printf("SOMA = %.2f%n", sum);
		double media = sum / quantidadeNumeros;
		System.out.printf("MEDIA = %.2f", media);
		sc.close();
	}

}
