package Fundamento;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("escreva F- para feminino e M para masculino.");
		char letra = entrada.next().charAt(0);
		if (letra == 'F' || letra == 'f') {
			System.out.println("Feminino");
		} else if (letra == 'M' || letra == 'm') {
			System.out.println("masculino");
		} else {
			System.out.println("letra invalida");
		}
	}
}
