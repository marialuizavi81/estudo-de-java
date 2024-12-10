package heranca;

public class Cavalo extends Mamifero{

	
	public Cavalo(String nome) {
		super(nome);
	}
	
	public void amostra() {
		System.out.printf(" o animal  %s é mamifero \n",nome);
	}
	public void comer(String tipo) {
		System.out.printf("o animal %s foi comer %s \n",nome,tipo);
	}
	
	public void locomover(String loco) {
		System.out.printf("o animal esta se movendo com %s",loco);
	}
	
}
