package Fundamento;

import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		double media ;
		Scanner entrada = new Scanner(System.in);
		System.out.println("escreva a primeira nota do aluno: ");
		double nota1 = entrada.nextDouble();
		System.out.println("escreva a segunda nota  do aluno: ");
		double nota2 = entrada.nextDouble();
		
		media = (nota1+nota2)/2;
		
		System.out.println("a suaa media é "+ media);
		
		
		
	}
}
