package aula01;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		int Maior = 0;
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("escreva um numero:");
		int resposta1 = entrada.nextInt();
		System.out.println("escreva um numero:");
		int resposta2 = entrada.nextInt();
		System.out.println("escreva um numero:");
		int resposta3 = entrada.nextInt();

		if (resposta1 > resposta2) {
			if (resposta1 > resposta2) {
				Maior = resposta1;
			}
		} else {
			if (resposta2 > resposta3) {
				Maior = resposta2;
			} else {
				Maior = resposta3;
			}
		}
		System.out.println("o maior é " + Maior + ".");
	}
}
