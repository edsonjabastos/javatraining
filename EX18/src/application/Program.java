package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantidadePessoas = 0, quantidadeHomens = 0, quantidadeMulheres = 0;
		double altura = 0.0, menorAltura = 0.0, maiorAltura = 0.0, mediaAlturaFeminina = 0.0;
		char genero;
		System.out.print("Quantas pessoas serão analizadas? ");
		quantidadePessoas = sc.nextInt();
		sc.nextLine();
		Pessoa[] pessoas = new Pessoa[quantidadePessoas];
		for (int i = 0; i < pessoas.length; i++) {
			System.out.printf("Altura da %dª pessoa: ", i + 1);
			altura = sc.nextDouble();
			sc.nextLine();
			System.out.printf("Gênero da %dª pessoa: ", i + 1);
			genero = sc.nextLine().charAt(0);
			pessoas[i] = new Pessoa(genero, altura);
			if (pessoas[i].getAltura() > maiorAltura) {
				maiorAltura = pessoas[i].getAltura();
			}
			if (pessoas[i].getGenero() == 'F') {
				mediaAlturaFeminina += pessoas[i].getAltura();
				quantidadeMulheres += 1;
			} else {
				quantidadeHomens += 1;
			}
		}
		menorAltura = pessoas[0].getAltura();
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getAltura() < menorAltura) {
				menorAltura = pessoas[i].getAltura();
			}
		}
		mediaAlturaFeminina = mediaAlturaFeminina / quantidadeMulheres;
		System.out.printf("Menor altura: %.2f%n", menorAltura);
		System.out.printf("Maior altura: %.2f%n", maiorAltura);
		System.out.printf("Media das alturas femininas: %.2f%n", mediaAlturaFeminina);
		System.out.printf("Numero de homens: %d", quantidadeHomens);
		sc.close();
	}

}
