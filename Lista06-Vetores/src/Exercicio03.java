//03 – Encontrar o maior número
//Crie um algoritmo que leia 5 números inteiros, armazene em um vetor e mostre o maior número armazenado.
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] vetor = new int[5];
		int maior = 0;
		
		for(int i = 0; i<vetor.length; i++) {
			System.out.println("Digite um valor inteiro: ");
			vetor[i] = input.nextInt();
			
			if(vetor[i]>maior) {
				maior = vetor[i];
			}
			
			
		}
		
		System.out.println(maior);

	}

}
