package heranca;

public class Escola {

	public static void main(String[] args) {
		Professor p1 = new Professor("abenilson","1234567890","45678654");
		Aluno a1 = new Aluno("ed","34567876543","876545678");
		
		a1.Sofrer();
		p1.certificar();
		p1.ncertificar();
		
		
	}

}
