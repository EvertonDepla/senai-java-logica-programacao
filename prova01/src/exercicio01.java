//Questão 1 — Venda de morangos no semáforo
//Um vendedor comercializa caixas de morangos em um semáforo. Para incentivar a compra de mais
//unidades, oferece preços diferentes conforme a quantidade adquirida.
//Quantidade comprada Preço por caixa
//1 caixa R$ 15,00
//2 ou mais caixas R$ 12,00
//Desafio: Solicite a quantidade de caixas, identifique o preço unitário, calcule e apresente o total da compra.
//Caso a quantidade seja menor ou igual a zero, informe que é inválida. Exemplo: 3 caixas custam R$ 36,00.

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantidade de caixas que você quer : ");
		double caixas = input.nextInt();
		double resultado = 0;
		
		if(caixas <2 && caixas >0) {
			resultado = caixas * 15;
			System.out.println(caixas + " caixas custam R$ " + resultado);
		}
		else if(caixas >=2) {
			resultado = caixas * 12;
			System.out.println(caixas + " caixas custam R$ " + resultado);
		}
		else if(caixas <=0) {
			System.out.println("valor invalido");
		}
	}

}
