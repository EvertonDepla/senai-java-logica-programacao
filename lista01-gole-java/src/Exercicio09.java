import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Informe a primeira nota : ");
		double nota1 = input.nextDouble();
		System.out.println("Informe a segunda nota : ");
		double nota2 = input.nextDouble();
		System.out.println("Informe a terceira nota : ");
		double nota3 = input.nextDouble();
		double media=(nota1*2 + nota2*3 + nota3*5)/10;
		System.out.println("Sua média será : " + media);

		input.close();
	}

}
