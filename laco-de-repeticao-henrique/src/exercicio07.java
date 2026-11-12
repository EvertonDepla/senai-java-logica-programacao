//7)Escreva um algoritmo que leia a altura de várias pessoas.
//A leitura deve continuar até que o usuário informe 0 como altura.
//Ao final, o programa deve calcular e exibir a média das alturas informadas.
//O valor 0 serve apenas para encerrar a entrada e não deve ser considerado no cálculo da média.

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double numero = 0;
		double acumula = 0;
		double conta = 0;
		
		while(true) {
			
			System.out.println("Digite a sua altura : ");
			numero = input.nextDouble();
			
			if(numero == 0) {
				break;
			}
			acumula = numero + acumula;
			conta++;
			
		}
		System.out.println("Sua média de altura é : " + (acumula/conta));

	}

}
