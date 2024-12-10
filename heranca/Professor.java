package heranca;

public class Professor extends Pessoa{
	
	public double salario;
	
	public Professor(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);
		
	}
	
	public void certificar() {
		System.out.println("ae, certificado!passou  mulek \n ");
	}
	public void ncertificar() {
		System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKK \n ");
	}
	
}
