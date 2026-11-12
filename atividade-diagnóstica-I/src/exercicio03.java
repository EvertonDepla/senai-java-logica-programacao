//3) Escreva um algoritmo que leia um número inteiro (N) e mostre a tabuada deste número de 
//2 até 8. O algoritmo deve finalizar o laço de repetição quando o número digitado (N) for um (1). 
//Ex. Número digitado 2 então 
//2x2 
//2x3 
//..... 
//2x8

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = 0;
		int repete = 2;
		
		while(true) {
			System.out.println("digite um numero entre 2 até 8 ou digite 1 para finalizar o loop : ");
			n = input.nextInt();
			
			if(n == 1) {
				break;
			}
			
			while(repete <=8) {
				System.out.println(n + " X " + repete + " = " + (n*repete));
				repete++;
			}
		}
		System.out.println("PROGRAMA ENCERRADO");

	}

}
