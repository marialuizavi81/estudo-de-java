package Fundamento;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("escreva um numero para saber  qual é o dia da semana: ");
		int Numero = entrada.nextInt();
		
		if(Numero == 1 ) {
			System.out.println("Domingo");}
		else if (Numero == 2) {
			System.out.println("segunda-feira");
		}else if (Numero == 3) {
			System.out.println("terça-feira");
		}else if (Numero == 4 ) {
			System.out.println("quarta-feira");
		}else if (Numero ==  5) { 
			System.out.println("quinta-feira");
		}else if (Numero == 6) {
			System.out.println("sexta-feira");
		}else if (Numero ==7 ) {
			System.out.println("sábado");
		}else {
			System.out.println("numero invalido");
		}

	}

}
