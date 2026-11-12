//2) Crie um programa em Java que solicite ao usuário um número inteiro positivo e imprima uma contagem regressiva desse número até 0,
//utilizando uma estrutura de repetição.
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro positivo : ");
		int numero = input.nextInt();
		
		while(numero >=0) {
			System.out.println(numero);
			numero = numero - 1;
		}

	}

}
