package Metodos;

public class Mania {

	public static void main(String[] args) {
		javaMetodos j1  = new javaMetodos();
		int anos = j1.idade();
		System.out.printf("a pessoa tem %d anos  de idade \n", anos);
		
		boolean vf = j1.estado();
		System.out.printf("o estado dessa pessoa é %b \n", vf);
		
		String nome = j1.nome();
		System.out.printf("o nome da pessoa é %s \n", nome);
		
		double valor = j1.valor();
		System.out.printf(" o valor de %.2f \n",valor);
	}
	

}
