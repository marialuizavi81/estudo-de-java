package Metodos;

public class Carro {

	public String cor;
	public String modelo;
	public double preco;
	public boolean status = false;

	public Carro() {

	}

	public Carro(String cor) {
		this.cor = cor;
	}

	public Carro(String cor, String modelo, double preco) {
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
	}

	public void ligar() {
		if (status) {
			System.out.println("nao pode ser ligado por que  ja esta");
		} else {
			System.out.println("ligado");
			status = true;
		}
	}

	public void desligar() {
		if (status) {
			System.out.println("desligado");
			status = false;
		} else {
			System.out.println("nao pode ser desligado por que  ja esta");
		}
	}

	public void acelerar() {
		if (status) {
			System.out.println("carro acelera");
		} else {
			System.out.println("o carro nao esta ligado");
		}

	}

	public void frear() {
		if (status) {
			System.out.println("ferar");
		} else {
			System.out.println("o carro esta ligado");
		}
	}

	public void abastecer() {
		if (status) {
			System.out.println("ele nao pode abastecer, esta ligado.");
		}
		System.out.println("abastecendo");
	}
}