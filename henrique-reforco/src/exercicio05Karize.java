import java.util.Scanner;

public class exercicio05Karize {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o valor da compra : ");
		double compra = input.nextDouble();
		
		if(compra <=100) {
			System.out.println("O valor da sua compra com descontos é de : " + compra);
		}
		else if(compra >=101 && compra <= 500) {
			System.out.println("O valor da sua compra com descontos é de : " + (compra - (compra * 0.05)));
		}
		else if(compra >=501 && compra <= 1000) {
			System.out.println("O valor da sua compra com descontos é de : " + (compra - (compra * 0.1)));
		}
		else if(compra >=1001 ) {
			System.out.println("O valor da sua compra com descontos é de : " + (compra - (compra * 0.15)));
		}

	}

}
