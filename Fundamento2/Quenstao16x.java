package Fundamento2;

import java.util.Scanner;

public class Quenstao16x {

	public static void main(String[] args) {
		double nota[] = new double[5];
		double soma = 0,media = 0; 
		
		//char nomes[] = {"alex","vladimir","pinpao","lucia","ana"};
		Scanner ent = new Scanner(System.in);
		
		for(int i = 0 ; i < nota.length ; i++) {
			System.out.printf(" escreva a nota do aluno %d\n",i);
			nota[i] = ent.nextDouble();
		}
		for(double u : nota) {
			soma += u; 
		}
		media= soma / nota.length;
		System.out.printf("a media da turma de %d alunos foi %d",nota.length,media);
	}

}
