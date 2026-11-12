import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite uma altura");
		double altura = input.nextDouble();
		System.out.println("Digite a largura");
		double largura = input.nextDouble();
		double area = largura * altura;
		System.out.println("Sua area do retangulo é : " + area);

		input.close();
	}

}
