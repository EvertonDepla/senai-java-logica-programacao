//02 – Somar os elementos
//Crie um algoritmo que leia 5 números inteiros, armazene em um vetor e apresente a soma de
//todos os elementos.

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] vetor = new int[5];
		int acumula = 0;
		
		for(int i = 0; i<vetor.length; i++) {
			System.out.println("Digite um valor inteiro: ");
			vetor[i] = input.nextInt();
			acumula = acumula + vetor[i];
			
		}
		
		System.out.println(acumula);

	}

}
