package Metodos;

import java.util.Scanner;

public class javaMetodos {
	Scanner sc =new Scanner(System.in);
	
	int idade() {
		System.out.println("Digite sua idade");
		int idade = sc.nextInt();
		return idade;
	}
	double valor() {
		return 25.87;
	}
	String nome() {
		return "wellington";
	}
	boolean estado() {
		return true;
	}
}

