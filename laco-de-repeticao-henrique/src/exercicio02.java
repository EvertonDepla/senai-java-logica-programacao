//2)Escreva um algoritmo que leia 5 números inteiros.
//Para cada número informado, o programa deve indicar se ele é par ou ímpar.

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int repete = 1;
		int par = 0;
		int impar = 0;
		
		while(repete<=5) {
			
			System.out.println("Digite um valor : ");
			int numero = input.nextInt();
			
			if(numero%2==0) {
				par++;
			}
			else if(numero%2!=0) {
				impar++;
			}
			repete++;
		}
		System.out.println("numeros impares : " + impar);
		System.out.println("numeros pares : " + par);

	}

}
