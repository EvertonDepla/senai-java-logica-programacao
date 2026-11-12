//1. 🎡 Parque de diversões — Voltas na roda-gigante
//Um parque possui uma roda-gigante que realiza sempre a mesma quantidade de voltas em cada passeio.

//Antes de iniciar o brinquedo, o operador informa ao sistema quantas voltas serão realizadas. 
//Durante o passeio, o sistema deve mostrar no painel o número da volta que está acontecendo.

//Por exemplo, se o operador informar 4, o painel deverá apresentar:

//Iniciando o passeio...

//Volta 1
//Volta 2
//Volta 3
//Volta 4

//Passeio encerrado!
//Desafio: desenvolva um programa em Java que leia a quantidade de voltas e apresente cada volta realizada.

//Antes de programar, interprete: o que determina quantas vezes a repetição acontecerá? Qual variável poderia representar a volta atual? Entre for e while, qual você considera mais adequado? Justifique sua escolha em um comentário no código.

 import java.util.Scanner;
public class exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int contar = 0;
		System.out.println("Quantas voltas você quer dar : ");
		int voltas = input.nextInt();
		
		while(voltas>contar) {
			
			contar++;
			System.out.println("Volta " + (contar+ 1));
			
			
		}
				

	}

}
