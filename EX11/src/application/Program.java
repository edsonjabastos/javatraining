package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quantidadeNumeros, numero, quantidadeNPar;
		System.out.println("Quanto numeros você vai digitar? ");
		quantidadeNumeros = sc.nextInt();
		sc.nextLine();
		int[] numeros = new int[quantidadeNumeros];
		numero = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número inteiro: ");
			numero = sc.nextInt();
			sc.nextLine();
			numeros[i] = numero;
		}
		System.out.println("NUMEROS PARES:");
		quantidadeNPar = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				quantidadeNPar += 1;
				System.out.println(numeros[i]);
			}
		}
		System.out.printf("QUANTIDADE DE PARES = %d", quantidadeNPar);

		sc.close();
	}
}
