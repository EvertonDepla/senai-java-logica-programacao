import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a temperatura em Fahrenheit : ");
		double fahrenheit = input.nextDouble();
		double celcius = (5*(fahrenheit-32))/9;
		System.out.println("A temperatura correspondente em célcius é : " + celcius);
		
		input.close();

	}

}
