//4)Declare um vetor de inteiros com 5 posições e solicite ao usuário que informe os valores que serão armazenados em cada posição.
//Após preencher o vetor, desenvolva um algoritmo que percorra seus elementos e identifique:
//a) Maior elemento: encontre e exiba o maior número armazenado no vetor.
//b) Menor elemento: encontre e exiba o menor número armazenado no vetor.
//c) Média dos elementos: calcule e exiba a média aritmética de todos os valores armazenados no vetor.

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int vetor[] = new int[5];
		int valorMaior = 0;
		int valorMenor = 100000;
		int valor = 0;
		int acumula = 0;
		double media = 0;
		
		for(int i = 0; i<vetor.length; i++) {
			System.out.println("Informe um valor : ");
			valor = input.nextInt();
			
			if(valor>valorMaior) {
				valorMaior = valor;
			}
			if(valor<valorMenor) {
				valorMenor = valor;
			}
			
			acumula = valor + acumula;
			
		}
		
		System.out.println(acumula);
		media = acumula/5;
		System.out.println("O maior valor é : " + valorMaior);
		System.out.println("O menor valor é : " + valorMenor);
		System.out.println("a média é : " + media);
				

	}

}
