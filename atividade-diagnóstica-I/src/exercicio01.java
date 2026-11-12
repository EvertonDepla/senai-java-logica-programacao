//1) Escrever um algoritmo que lê 5 valores para N, um de cada vez, e conta quantos destes valores são NEGATIVOS, escrevendo esta informação.

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = 0;
		int repete = 1;
		int negativo = 0;
		
		while(repete<=5) {
			System.out.println("Digite um valor : ");
			n = input.nextInt();
			if(n<0) {
				negativo++;
			}
			repete++;
		}
		System.out.println("O total de valores negativos é : " + negativo);

	}

}
