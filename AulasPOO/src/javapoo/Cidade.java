package javapoo;

import java.util.Locale;

public class Cidade {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Pessoa p1 = new Pessoa();

		System.out.printf("%s tem o peso de %.2f e tem idade de %d ".formatted(p1.nome, p1.peso, p1.idade));
		System.out.printf("\n%s tem o peso de %.2f e tem idade de %d \n", p1.nome, p1.peso, p1.idade);
		p1.Cadastrar();
		p1.comer();

	}

}
