package Fundamento2;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		int turma =1, n =1;
		float soma = 0, media = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println(" escreva o numero de alunos e depois coloque suas notas \n quantidade da turma: ");
		turma = entrada.nextInt();
		
		while (n <= turma) {
			System.out.println("escreva a nota do aluno "+ n +" :");
			soma = entrada.nextFloat();
			soma = soma + soma;
			n++;
			
		}
		media = soma / turma;
		System.out.println(" a media da turma de "+ turma +" alunos é "+ media);

	}

}
