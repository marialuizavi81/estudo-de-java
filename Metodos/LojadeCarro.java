package Metodos;

public class LojadeCarro {

	public static void main(String[] args) {
		Carro fusca = new Carro();
		Carro uno  = new Carro("rosa");
		Carro ferrari  = new Carro("vermelho", "SDFGHJKL",54.3);
		
		Honda anastacia = new Honda("SDFGHJKL","SDFGHJKL","abub",54.3);
		
		ferrari.acelerar();
		ferrari.frear();
		ferrari.ligar();
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.frear();
		ferrari.abastecer();
		ferrari.desligar();
		ferrari.abastecer();
		
		

	}

}
