package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int nElementos;
		double numero, mediaVetor, somaNumerosVetor;
		System.out.println("Quantos elementos vai ter o vetor? ");
		nElementos = sc.nextInt();
		double[] numeros = new double[nElementos];
		somaNumerosVetor = 0.0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número: ");
			numero = sc.nextDouble();
			numeros[i] = numero;
			somaNumerosVetor += numeros[i];
		}
		mediaVetor = somaNumerosVetor / nElementos;
		System.out.printf("MEDIA DO VETOR = %.3f%n", mediaVetor);
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < mediaVetor) {
				System.out.println(numeros[i]);
			}
		}
		sc.close();
	}
}
