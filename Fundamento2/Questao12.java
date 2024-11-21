package Fundamento2;

public class Questao12 {

	public static void main(String[] args) {
		int soma1 = 0;
		int soma2 = 0;
		int media = 0;
		
		
		for (int i = 0;i <= 20; i++) {
			if (i%3==0) {
				 soma1 += i; 
			}
		if (i %5==0) {
			soma2 += i; 
		}
	}
		media = soma2 + soma1;
		
		System.out.println("a soma1 é " + soma1);
		System.out.println("a soma2 é " + soma2);
		System.out.println("a media é " + media);
}}
