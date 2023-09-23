package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quantidadePessoas, idade, maiorIdade;
		String nome;
		Pessoa pessoaMaisVelha = new Pessoa();

		System.out.print("Quantas pessoas vai cadastrar? ");
		quantidadePessoas = sc.nextInt();
		sc.nextLine();
		Pessoa[] pessoas = new Pessoa[quantidadePessoas];
		maiorIdade = 0;
		for (int i = 0; i < pessoas.length; i++) {
			System.out.printf("Dados da %dª pessoa:%nNome:", i + 1);
			nome = sc.nextLine();
			System.out.print("Idade: ");
			idade = sc.nextInt();
			sc.nextLine();
			pessoas[i] = new Pessoa(nome, idade);
			if (idade > maiorIdade) {
				maiorIdade = idade;
				pessoaMaisVelha = pessoas[i];
			}
		}
		System.out.print("PESSOA MAIS VELHA: " + pessoaMaisVelha.getNome());
		sc.close();
	}
}
