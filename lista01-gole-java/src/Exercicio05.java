import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu salario : ");
		double salario = input.nextDouble();
		double novoSalario = salario + (salario * 0.10);
		System.out.println("Seu novo salario com aumento de 10% é  : " + novoSalario);
		
		input.close();

	}

}
