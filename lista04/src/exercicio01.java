
//1. Escrever um algoritmo que lê 5 valores para a, um de cada vez, e conta
//quantos destes valores são negativos, escrevendo esta informação

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int negativo = 0;
		int repete = 1;
		
		while(repete<=5) {
			System.out.println("Digite um numero : ");
			int numero = input.nextInt();
			
			if(numero < 0) {
				negativo++;
			}
			repete++;
		}
		System.out.println("Os numeros negatios são : " + negativo); 

	}

}
