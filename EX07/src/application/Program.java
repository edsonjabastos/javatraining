package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números precisa checar? (Máximo 10)");
		int n = sc.nextInt();
		//sc.nextLine();
		while (n > 10) {
			System.out.println("Número acima de 10 inválido.");
			System.out.println("Digite uma quantidade de números para checar: ");
			n = sc.nextInt();
			//sc.nextLine();
		}
		sc.nextLine();
		int[] vect = new int[n];
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número: ");
			int number = sc.nextInt();
			sc.nextLine();
			vect[i] = number;
		}
		System.out.println("Números negativos: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		System.out.println(vect.toString());
		sc.close();
	}
}
