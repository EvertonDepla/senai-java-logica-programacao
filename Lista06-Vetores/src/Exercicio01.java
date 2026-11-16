//01 – Armazenar e mostrar números
//Crie um algoritmo que leia 5 números inteiros, armazene em um vetor e mostre todos os números
//na mesma ordem em que foram digitados

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] vetor = new int[5];
		
		for(int i = 0; i<vetor.length; i++) {
			System.out.println("Digite um valor inteiro: ");
			vetor[i] = input.nextInt();
			
		}
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		System.out.println(vetor[3]);
		System.out.println(vetor[4]);
		

	}

}
