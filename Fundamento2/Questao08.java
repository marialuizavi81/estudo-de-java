package Fundamento2;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		int n=1,y=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("escreva um numero patra ver os numeroos inpares até o seu numero: ");
		
		y = entrada.nextInt();
		
		while (n <= y) {
			if (n%2!= 0) {
				System.out.println(n);
			}
			n++;
		}

	}

}
