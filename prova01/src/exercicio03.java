//Questão 3 — Ingresso de cinema
//Um cinema precisa determinar o valor do ingresso conforme a idade do cliente.
//Idade Categoria Valor
//Menor de 12 anos Infantil R$ 10,00
//De 12 a 59 anos Inteira R$ 20,00
//60 anos ou mais Idoso R$ 10,00
//Desafio: Solicite a idade, apresente a categoria e o valor do ingresso. Idades negativas devem ser
//consideradas inválidas.

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe sua idade : ");
		int idade = input.nextInt();
		double resultado =0;
		
		if(idade < 0) {
			System.out.println("Idade invalida");
		}
		
		else if( idade <12  || idade >=60) {
			
			resultado = 10;
			System.out.println("Menor de 12 anos Infantil e 60 anos ou mais Idoso pagam :R$ " + resultado);
		}
		else if(idade >= 12 || idade <=59) {
			
			resultado = 20;
			System.out.println("De 12 a 59 anos Inteira R$ " + resultado);
		}
		
	}

}
