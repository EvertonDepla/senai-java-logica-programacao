//7. Escreva um algoritmo que calcule a média aritmética das 3 notas dos alunos de
//uma classe. O algoritmo deverá ler, além das notas, o código do aluno e deverá
//ser encerrado quando o código for igual a zero.

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int alunoCode = 0;
		int repete = 1;
		int nota = 0;
		int juntar = 0;
		
		while(true) {
			
			System.out.println("Digite o numero do seu código : ");
			alunoCode = input.nextInt();
			
			if(alunoCode == 0) {
				break;
			}
			
			while(repete<= 3) {
				System.out.println("Digite uma das 3 notas : ");
				nota = input.nextInt();
				
				juntar = nota + juntar;
				
				repete++;
			}
			int media = juntar/3;
			
			System.out.println("a sua media foi de : " + media);
			
		}
		System.out.println("PROGRAMA ENCERRADO");

	}

}
