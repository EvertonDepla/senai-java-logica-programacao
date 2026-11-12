//5) Escreva um algoritmo que leia o nome de 5 Alunos e suas 3 notas (Um aluno por vez). 
//Calcule a média aritmética e caso a média seja >= 7 escreva a mensagem “Aprovado”, 
//caso a média seja < 7 e >=6 escreva a mensagem “Exame”, caso seja < 6 escreva a 
//mensagem “Reprovado”, junto com o nome do aluno. Ex Pedro Aprovado, Antônio 
//Exame...
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double n4 = 0;
		double media = 0;
		String nome = "";
		int repete = 1;
		
		while(repete <=5) {
			
			System.out.println("Digite seu nome : ");
			nome = input.nextLine();
			
			System.out.println("Digite a primeira nota : ");
			n1 = input.nextDouble();
			System.out.println("Digite a segunda nota : ");
			n2 = input.nextDouble();
			System.out.println("Digite a terceira nota : ");
			n3 = input.nextDouble();
			System.out.println("Digite a quarta nota : ");
			n4 = input.nextDouble();
			
			input.nextLine();
			
			media = (n1+n2+n3)/4;
			
			if(media >= 7) {
				System.out.println(nome + " Você foi aprovado");
			}
			else if(media < 7 && media >=6) {
				System.out.println(nome + " Você está em exame");
			}
			else if(media <6) {
				System.out.println(nome + " Você está Reprovado");
			}
			repete++;
		}

	}

}
