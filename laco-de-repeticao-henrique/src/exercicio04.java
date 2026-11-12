//4)Escreva um algoritmo que calcule e exiba:
//a) A soma de todos os números pares entre 1 e 100.
//b) A soma de todos os números ímpares entre 1 e 100

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int acumulaPar = 0;
		int acumulaImpar = 0;
		int repete = 1;
		
		while(repete <=100) {
		
			
			if(repete%2==0) {
				acumulaPar = repete + acumulaPar;
			}
			else if(repete%2!=0) {
				acumulaImpar = repete + acumulaImpar;
			}
			repete++;
			
		}
		System.out.println("Numeros pares : " + acumulaImpar);
		System.out.println("Numeros impares : " + acumulaPar);
		
	}

}
