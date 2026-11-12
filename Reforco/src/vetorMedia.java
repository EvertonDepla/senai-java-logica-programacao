
public class vetorMedia {

	public static void main(String[] args) {
		
		double[] notas = {7,8,5.5,6,9};
		double soma= 0;
		
		for(int i = 0; i<notas.length; i++) {
			soma= notas[i] + soma;
		}
		System.out.println(soma/notas.length);

	}

}
