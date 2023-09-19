package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantidadeAlunos;
		double nota1, nota2, media;
		String nome;
		System.out.print("Quantos alunos serão avaliados? ");
		quantidadeAlunos = sc.nextInt();
		sc.nextLine();
		Aluno[] alunos = new Aluno[quantidadeAlunos];

		for (int i = 0; i < alunos.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %dº aluno: %n", i + 1);
			nome = sc.nextLine();
			nota1 = sc.nextDouble();
			sc.nextLine();
			nota2 = sc.nextDouble();
			sc.nextLine();
			media = (nota1 + nota2) / 2;
			alunos[i] = new Aluno(nome, nota1, nota2, media);
		}
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i].getMedia() >= 6) {
				System.out.println(alunos[i].getNome());
			}
		}
		System.out.println("Alunos avaliados:");
		for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i].getNome() + " => " + alunos[i].getMedia());
		}
		sc.close();
	}
}
