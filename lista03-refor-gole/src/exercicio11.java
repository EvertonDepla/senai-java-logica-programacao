
//11) Leia 10 números inteiros e, ao final, informe quantos são pares e quantos são ímpares.

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int repete = 1;
		int impar = 0;
		int par = 0;
		
		
		while(repete<=10) {
			System.out.println("Informe um numero : ");
			int numero = input.nextInt();
			
			if(numero % 2== 0) {
				par++;
			}
			else {
				impar++;
			}	
			repete++;
		}
		System.out.println("Numero de par : " + par);
		System.out.println("Numero de impar : " + impar);

	}

}
