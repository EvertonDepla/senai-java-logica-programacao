import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor do seu carro : ");
		double carro = input.nextDouble();
		double novoPrecoCarro = carro+(carro*28/100)+(carro*45/100);
		System.out.println("Seu carro com custo de fábrica e impostos é de : " + novoPrecoCarro);
		
		input.close();

	}

}
