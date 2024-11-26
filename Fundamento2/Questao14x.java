package Fundamento2;

public class Questao14x {

	public static void main(String[] args) {
		int arreyNum[] = {56,73,153,23,24,11,275,12,39};
		int	total =0;
		// ADICIONA O VALORDE CADA ELEMENTO TOTAL
		for (int i : arreyNum)
			total += i;
		System.out.printf("soma dos lementos arreyNum: %d\n",total );

}
}