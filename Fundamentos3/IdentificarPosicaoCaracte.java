package Fundamentos3; 

public class IdentificarPosicaoCaracte {

	public static void main(String[] args) {
		String str = "Hello World World2";
		int pos = str.indexOf("l");
		System.out.println(pos);
		int pos2 = str.lastIndexOf("l");
		System.out.println(pos2);
	}

}
