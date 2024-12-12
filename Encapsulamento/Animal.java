package Encapsulamento;

public class Animal {
	private String nome, tutor, Rg, raca, mesdeaniversario;
	private int idade;
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTutor() {
		return tutor;
	}


	public void setTutor(String tutor) {
		this.tutor = tutor;
	}


	public String getRg() {
		return Rg;
	}


	public void setRg(String rg) {
		Rg = rg;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public String getMesdeaniversario() {
		return mesdeaniversario;
	}


	public void setMesdeaniversario(String mesdeaniversario) {
		this.mesdeaniversario = mesdeaniversario;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", tutor=" + tutor + ", Rg=" + Rg + ", raca=" + raca + ", mesdeaniversario="
				+ mesdeaniversario + ", idade=" + idade + "]";
	}

	
}
