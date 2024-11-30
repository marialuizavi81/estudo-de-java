package javapoo;

import java.util.Scanner;

public class Pessoa {
	Scanner ent = new Scanner(System.in);

	String nome;
	Double peso;
	int idade;

	public void comer() {
		System.out.println(this.nome + " foi comer...");
	}

	public void Cadastrar() {
		System.out.println("escreva seu nome: ");
		this.nome = ent.nextLine();
		System.out.println("escreva seu peso: ");
		this.peso = ent.nextDouble();
		System.out.println("escreva sua idade: ");
		this.idade = ent.nextInt();

	}
}
