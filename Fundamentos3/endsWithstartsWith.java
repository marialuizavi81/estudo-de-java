package Fundamentos3;

public class endsWithstartsWith {

	public static void main(String[] args) {
		String valor = "CDD - Java";
		System.out.println(valor.endsWith("java"));
		System.out.println(valor.startsWith("C"));
		System.out.println(valor.startsWith("DD",1));
	}

}
