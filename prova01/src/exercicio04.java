//Questão 4 — Análise de empréstimo
//Uma instituição financeira aprova inicialmente um empréstimo somente quando todas as condições abaixo
//são atendidas: idade igual ou superior a 18 anos; renda mensal igual ou superior a R$ 2.000,00; valor
//solicitado não superior a cinco vezes a renda mensal.
//Desafio: Solicite idade, renda mensal e valor solicitado. Exiba “Empréstimo aprovado” ou “Empréstimo não
//aprovado”. Considere inválidos idade negativa, renda menor ou igual a zero e empréstimo menor ou igual a
//zero. Exemplo: idade 25 anos e renda R$ 3.000,00 permitem solicitar até R$ 15.000,00.
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe sua idade : ");
		int idade = input.nextInt();
		System.out.println("Informe sua renda mensal : ");
		double rendaMensal = input.nextDouble();
		System.out.println("Seu valor de emprestimo solicitado");
		double emprestimo = input.nextDouble();
		double calculo =0;
		
		if(idade < 0 || rendaMensal <=0 || emprestimo <=0) {
			System.out.println("é Considerado inválidos idade negativa, renda menor ou igual a zero e empréstimo menor ou igual a zero");
		}
		
		else if( idade >= 18 && rendaMensal >=2000 && emprestimo <= rendaMensal*5) {
			
			System.out.println("Empréstimo aprovado");
		}
		else {
			System.out.println("Empréstimo não aprovado");
		}
		
	}

}
