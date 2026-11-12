//Questão 2 — Reajuste salarial por tempo de empresa
//Uma empresa de tecnologia oferece reajustes conforme o tempo de serviço, considerando anos completos.
//Tempo de empresa Reajuste
//Menos de 5 anos 0%
//De 5 até 10 anos (inclusive) 10%
//Mais de 10 anos 15%
//Desafio: Solicite salário atual e tempo de empresa; identifique o percentual, calcule o aumento e apresente
//o novo salário. Salário menor ou igual a zero e tempo negativo são inválidos. Exemplo: R$ 3.000,00 e 7 anos:
//aumento de R$ 300,00, novo salário de R$ 3.300,00.

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o seu salario base : ");
		double salario = input.nextDouble();
		System.out.println("Informe a quanto tempo você está na empresa : ");
		int tempo = input.nextInt();
		
		if(tempo <5 && salario > 0  && tempo >= 0) {
			System.out.println("Salario é : " + salario);
		}
		else if(tempo >=5 && tempo < 10) {
			System.out.println("Seu salario é : " + (salario + (salario*0.1)));
		}
		else if(tempo >=10 && salario > 0) {
			System.out.println("Seu salario é : " + (salario + (salario*0.15)));
		}
		else if(salario <= 0 || tempo < 0 ) {
			System.out.println("Salário menor ou igual a zero e tempo negativo são inválidos");
		}

	}

}
