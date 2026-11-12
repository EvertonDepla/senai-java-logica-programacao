import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite quantos dolares você tem : ");
		double dolar = input.nextDouble();
		
		double conversao =  dolar * 5.20;
		System.out.println("Você trocou : " + dolar + "Por : " + conversao +  " Reais");
		
		input.close();

	}

}
