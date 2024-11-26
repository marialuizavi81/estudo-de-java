package Fundamento2;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		int arreyUm[] = new int[4];
		int arreyDois[] = new int[4];
		int arreyTres[] = new int[4];
		int arreyQuatro[] = new int[4];

		Scanner entrada = new Scanner(System.in);

		for (int i = 0 ; i < arreyUm.length; i++) {
			System.out.println("escreva um numero para ser colocado na lista (a)");
			arreyUm[i] = entrada.nextInt();
		}

		for (int y : arreyUm) {
			System.out.print(y+" ");

		}
	}
}
