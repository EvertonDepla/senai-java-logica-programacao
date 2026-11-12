//9)Escreva um algoritmo que leia, para cada atleta:
//Número de inscrição
//Altura
//A leitura deve continuar até que o usuário informe 0 como número de inscrição.
//Ao final, o programa deve informar:
//a) O número de inscrição e a altura do atleta mais alto.
//b) O número de inscrição e a altura do atleta mais baixo.
//c) A altura média dos atletas.
//d) A quantidade total de atletas cadastrados.
//O número de inscrição 0 serve apenas para encerrar a entrada e não representa um atleta.

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeroInscricao = 0;
		double altura =  0;
		double alturaMax= 0;
		double alturaMin= 1000;
		double atletaMax=0;
		double atletaMin=0;
		double alturaSoma = 0;
		int atletas =0;
		
		while(true) {
			
			System.out.println("Digite a inscrição do aluno : ");
			numeroInscricao = input.nextInt();
			
			if(numeroInscricao == 0) {
				break;
			}
			
			System.out.println("Digite a altura do aluno : ");
			altura= input.nextDouble();
			
			if(altura>alturaMax) {
				alturaMax = altura;
				atletaMax = numeroInscricao;
			}
			else if(altura<alturaMin) {
				alturaMin = altura;
				atletaMin = numeroInscricao;
			}
			
			alturaSoma = altura + alturaSoma;
			
			atletas++;
		}
		System.out.println("O aluno comm o Número de inscrição : " + atletaMax + " e altura de : " + alturaMax + " é o maior da classe");
		System.out.println("O aluno comm o Número de inscrição : " + atletaMin + " e altura de : " + alturaMin + " é o menor da classe");
		System.out.println("A média de altura da turma é : " + (alturaSoma/atletas));

	}

}
