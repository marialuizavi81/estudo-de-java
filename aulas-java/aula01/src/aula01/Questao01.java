package aula01;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um numero: ");
		int resp = entrada.nextInt();
		if(resp >=0 ) {
			System.out.println("o "+ resp +" é positivo");
			
		} else {
			System.out.println("o "+ resp +" é negativo");
		}

	}

}
