package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantidadeNumeros, posicaoMaiorN;
		double numeroMaior;
		System.out.println("Quantos numeros voce vai digitar? ");
		quantidadeNumeros = sc.nextInt();
		sc.nextLine();
		double[] numeros = new double[quantidadeNumeros];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextDouble();
			sc.nextLine();
		}
		numeroMaior = numeros[0]; // Initialize with the first element
		posicaoMaiorN = 0; // Initialize with the index of the first element

		for (int i = 1; i < numeros.length; i++) {
		    if (numeros[i] > numeroMaior) {
		        numeroMaior = numeros[i];
		        posicaoMaiorN = i;
		    }
		}
		System.out.printf("MAIOR VALOR = %.1f%n", numeroMaior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d%n", posicaoMaiorN);
		sc.close();
	}

}
