import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a largura :");
		double largura = input.nextDouble();
		System.out.println("Informe a altura : ");
		double altura = input.nextDouble();
		double perimetro = (altura + largura) * 2;
		double area = altura * largura;
		System.out.println("O perimetro é " + perimetro);
		System.out.println("A area é " + area);

	}

}
