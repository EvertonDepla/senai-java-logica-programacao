
//10) Leia 8 notas e calcule a média aritmética das notas informadas

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int repete = 1;
		double soma =0;
		
		while(repete <9 ) {
			
			
			System.out.println("digite a nota : ");
			double notas = input.nextDouble();
			soma = soma + notas;
			repete++;
			
		}
		System.out.println("sua media é : " + (soma/8));

	}

}
