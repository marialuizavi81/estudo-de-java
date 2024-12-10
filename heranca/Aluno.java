package heranca;

public class Aluno extends Pessoa {
	
	public double nota;
	
	public Aluno(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);
		
	}

	public void Sofrer() {
		System.out.printf("%S AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \n ",nome);
	}
	
}
