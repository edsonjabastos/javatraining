package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantidadeInteiros, numero, somaPares, contadorPares;
		double media;

		System.out.print("Quantos elementos vai ter o vetor? ");
		quantidadeInteiros = sc.nextInt();
		sc.nextLine();
		int[] vetor = new int[quantidadeInteiros];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();
			sc.nextLine();
			vetor[i] = numero;
		}
		somaPares = 0;
		contadorPares = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				somaPares += vetor[i];
				contadorPares += 1;
			}
		}
		if (contadorPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			media = somaPares / contadorPares;
			System.out.printf("MÉDIA DOS PARES = %.2f", media);
		}

		sc.close();
	}

}
