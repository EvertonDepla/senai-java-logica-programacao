//12. Escrever um algoritmo que leia 20 valores para uma variável n e, para cada
//um deles, calcule a tabuada de 1 até n. Mostre a tabuada na forma:
//1 x n = n
//2 x n = 2n
//3 x n = 3n.......
//n x n = n2

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int repete = 1;
		int vezes = 1;
		int total = 0;
		
		while(repete<=20) {
			
			System.out.println("Digite um valor : ");
			int n = input.nextInt();
			
			while(true) {
				total = n*vezes;
				System.out.println(vezes + " X " + n + " = " + total);
				if(n == vezes) {
					break;
				}
				vezes++;
			} 
			vezes = 1;
			
			
			repete++;
			
		}

	}

}
