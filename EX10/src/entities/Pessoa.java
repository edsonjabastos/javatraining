package entities;

public class Pessoa {
	String nome;
	int idade;
	float altura;
	public Pessoa(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public String toString() {
		return "Dados pessoa:\n" + "Nome: " + nome + ", Idade: " + idade + ", Altura: $ "
				+ String.format("%.2f", altura);
	}
}
