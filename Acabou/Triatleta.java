package Acabou;

public class Triatleta implements Nadado,Corredo,Ciclistas{

	String nome;
	double peso,aaltura;
	int idade;
	
	public Triatleta(String nome, double peso, double aaltura, int idade) {
		this.nome = nome;
		this.peso = peso;
		this.aaltura = aaltura;
		this.idade = idade;
	}

	@Override
	public void aquecer() {
		System.out.println("esta aquecendo");
	}

	@Override
	public void pedalando() {
		System.out.println("esta pedalando");
		
	}

	@Override
	public void correr() {
		System.out.println("esta correndo");
		
	}

	@Override
	public void nadando() {
		System.out.println("esta nadando");
		
	}
	
	
	
}
