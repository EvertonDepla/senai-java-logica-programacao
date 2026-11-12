//3) Escreva um algoritmo que leia um número inteiro (N) e mostre a tabuada deste número de 1 até 10.
//O algoritmo deve finalizar o laço de repetição quando o número digitado (N) for Zero (0)
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = 0;
		int repete = 1;
		
		while(true) {
			System.out.println("digite um numero entre 1 até 10 ou digite 0 para finalizar o loop : ");
			n = input.nextInt();
			
			if(n == 0) {
				break;
			}
			
			while(repete <=10) {
				System.out.println(n + " X " + repete + " = " + (n*repete));
				repete++;
			}
		}
		System.out.println("PROGRAMA ENCERRADO");

	}

}

