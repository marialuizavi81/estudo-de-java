package Fundamento2;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int turma= 0 ;
		double soma = 0; 
		double media = 0;
		System.out.println("escreva a quantidade de alunos: ");
		turma = entrada.nextInt();
		for(int i = 1; i < turma;i++) {
			System.out.println("escreva a nota do aluno "+ i+ " :");
			soma = entrada.nextDouble();
			soma += soma;
	}
		media = soma/turma;
		System.out.println(" a media é " + media);
}}
