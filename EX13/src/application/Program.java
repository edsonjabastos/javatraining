package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int tamanhoVetores, numero;
		System.out.println("Quantos valores vai ter cada vetor? ");
		tamanhoVetores = sc.nextInt();
		System.out.println(tamanhoVetores);

		int[] numerosA = new int[tamanhoVetores];
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < numerosA.length; i++) {
			numero = sc.nextInt();
			sc.nextLine();
			numerosA[i] = numero;

		}
		int[] numerosB = new int[tamanhoVetores];
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < numerosB.length; i++) {
			numero = sc.nextInt();
			sc.nextLine();
			numerosB[i] = numero;

		}
		int[] numerosC = new int[tamanhoVetores];
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < numerosC.length; i++) {
			numerosC[i] = numerosA[i] + numerosB[i];

		}
		System.out.println("VETOR RESULTANTE(C): ");
		for (int i = 0; i < numerosC.length; i++) {
			System.out.println(numerosC[i]);
		}
		sc.close();
	}

}
