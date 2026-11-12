//4) Faça um programa que se repita por 10 Vezes e peça as seguintes informações 
//a) Faixa (O usuário irá digitar 1 para Adulto e 2 para Adolescente) 
//b) Idade 
//Ao final o programa deverá informar o Número de Adultos, O Número de Adolescentes, a 
//Média de idade dos Adultos e a Média de idade dos Adolescentes 

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero = 0;
		int adulto = 0;
		int adolescente = 0;
		int idade = 0;
		int idadeAdulto = 0;
		int idadeAdolescente = 0;
		int repete = 1;
		
		while(repete <=5) {
			System.out.println("digite 1 para Adulto e 2 para Adolescente : ");
			numero = input.nextInt();
			
			if(numero == 1) {
				System.out.println("Digite a idade : ");
				idade = input.nextInt();
				idadeAdulto = idadeAdulto + idade;
				adulto++;
			}
			else if(numero == 2) {
				System.out.println("Digite a idade : ");
				idade = input.nextInt();
				idadeAdolescente = idadeAdolescente + idade;
				adolescente++;
			}
			repete++;
		}
		System.out.println("O total de adultos é : " + adulto);
		System.out.println("A média de idade dos adultos é : " + (idadeAdulto/adulto));
		System.out.println("O total de adolescentes é : " + adolescente);
		System.out.println("A média de idade dos adolescentes é : " + (idadeAdolescente/adolescente));
		

	}

}
