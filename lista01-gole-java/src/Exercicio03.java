import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos anos você tem : ");
		double anos = input.nextDouble();
		System.out.println("quantos meses vocÊ tem : ");
		double meses = input.nextDouble();
		double diasTotais = (anos * 365) + (meses * 30);
		System.out.println(" VocÊ tem o total de " + diasTotais + " dias");
		
		input.close();

	}

}
