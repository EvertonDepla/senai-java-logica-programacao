//10. Escreva um algoritmo que leia o código de um aluno e suas três notas.
//Calcule a média ponderada do aluno, considerando que o peso para a maior nota
//seja 4 e para as duas restantes, 3. Mostre o código do aluno, suas três notas, a
//média calculada e uma mensagem "APROVADO" se a média for maior ou igual a 5 e
//"REPROVADO" se a média for menor que 5. Repita a operação até que o código lido seja negativo.

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			int codigo = 0;
			double nota = 0;
			int repete = 1;
			double acumula = 0;
			double notaMaior = 0;
			double media = 0;
			
			System.out.println("Digite seu código : ");
			codigo = input.nextInt();
			
			if(codigo <0) {
				break;
			}
			
			while(repete <=3) {
				System.out.println("Digite a primeira nota : ");
				nota = input.nextDouble();
				
				if(nota>notaMaior) {
					notaMaior = nota;
				}
				acumula = nota + acumula;
				repete++;
			}
			
			media = (((acumula - notaMaior)*3) + (notaMaior*4))/10;
					//(7 * 2 + 8 * 3 + 10 * 5) / (2 + 3 + 5)
			
			if(media>=5) {
				System.out.println("Seu código é "+ codigo + " Sua média é : " + media + " Você está aprovado");
			}
			else {
				System.out.println("Seu código é "+ codigo + " Sua média é : " + media + " Você está reprovado");
			}
			
			
		}
		

	}

}