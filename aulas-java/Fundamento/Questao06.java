package Fundamento;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int resp = 0;
		System.out.println("Digite 0 para FALSO \n Digite 1 para VERDADEIRO");
		System.out.println("telefonou para a vitima ? ");
		resp += entrada.nextInt();
		System.out.println("esteve no local do crime ?");
		resp += entrada.nextInt();
		System.out.println("mora perto da vitima ?");
		resp += entrada.nextInt();
		System.out.println("devia para a vitima?");
		resp += entrada.nextInt();
		System.out.println("ja trabalhou vom a vitima?");
		resp += entrada.nextInt();
		
		
		if (resp == 1) {
			    System.out.println("inocente");
		}  else { 
			if(resp == 2) {
				System.out.println("Suspeito");
			} else { 
				if(resp == 3|| resp == 4) {
					System.out.println("cumplice");
				}
		 else { if(resp == 5) {
			    System.out.println("culpado é o levi");
	}
}
}
}
