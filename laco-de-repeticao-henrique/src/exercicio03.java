//3)Escreva um algoritmo que leia a altura de 5 pessoas.
//Ao final, o programa deve calcular e exibir a altura média das pessoas.

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double altura = 0;
		double acumula = 0;
		
		for(int i = 0; i<=4; i++) {
			
			System.out.println("Informe a sua altura : ");
			altura = input.nextDouble();
			
			acumula = acumula + altura;
		}
		System.out.println("Sua média de altura é : " + (acumula/5));

	}

}
