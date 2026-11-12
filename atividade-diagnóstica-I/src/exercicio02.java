//2) Escreva um algoritmo que leia 5 valores inteiros e ao final exiba: 
//a) a soma dos números negativos; 
//b) a quantidade de valores positivos. 

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int valor = 0;
		int repete = 1;
		int somaNegativo = 0;
		int acumulaPositivo = 0;
		
		while(repete <=5) {
			System.out.println("Digite um valor : ");
			valor = input.nextInt();
			
			if(valor<0) {
				somaNegativo = somaNegativo + valor;
			}
			else if(valor>0) {
				acumulaPositivo++;
			}
			repete++;
		}
		System.out.println("a soma dos números negativos é :  "+ somaNegativo);
		System.out.println("a quantidade de valores positivos é : " + acumulaPositivo);
	}

}
