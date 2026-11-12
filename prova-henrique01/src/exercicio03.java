//3)Uma empresa deseja calcular a comissão mensal de seus vendedores. 
//Para isso, o programa deverá solicitar a quantidade de vendedores que serão analisados e, em seguida, pedir o nome e o valor total de vendas de cada vendedor.
//A comissão será calculada de acordo com o valor total vendido no mês:
//Vendas de até R$ 2.000,00: comissão de 5%.
//Vendas acima de R$ 2.000,00 até R$ 5.000,00: comissão de 8%.
//Vendas acima de R$ 5.000,00: comissão de 10%.
//O programa deverá solicitar os dados de cada vendedor, calcular sua comissão e exibir seu nome, o valor vendido e o valor da comissão.
//Ao final, deverá apresentar o valor total de comissões que a empresa pagará a todos os vendedores.
//Ponto extra:
//Modifique o programa para que, além do total de comissões, ele também exiba:
//A quantidade de vendedores que receberam comissão de 10%.
//A maior comissão paga a um vendedor
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o numero de vendedores que serão analisados : ");
		int vendedoresAnalisados  = input.nextInt();
		
		double comissoesTotais = 0;
		double valorVendido = 0;
		double comissaoVendedor = 0;
		int vendedores10 = 0;
		double maiorComissao = 0;
		
		int repete = 0;
		
		while(vendedoresAnalisados!= repete) {
			System.out.println("Informe o nome do vendedor : ");
			String nomeVendedor = input.next();
			System.out.println("Informe o valor da suas vendas : ");
			valorVendido = input.nextDouble();
			
			if(valorVendido<=2000) {
				comissaoVendedor = valorVendido * 0.05;
			}
			else if(valorVendido>2000 && valorVendido<=5000) {
				comissaoVendedor = valorVendido * 0.08;
			}
			else if(valorVendido>5000 ) {
				comissaoVendedor = valorVendido * 0.1;
				vendedores10 = vendedores10 +1;
			}
			
			if(valorVendido>maiorComissao) {
				maiorComissao = valorVendido;
			}
			
			comissoesTotais = comissoesTotais + comissaoVendedor;
			
			System.out.println("O vendededor : "+ nomeVendedor);
			System.out.println("Total de vendas : R$" + valorVendido);
			System.out.println("Comissão de vendas : R$" + comissaoVendedor);
			
			repete++;
		}
		System.out.println("///////////////");
		System.out.println("Total de comissão paga a vendedores : R$"+comissoesTotais);
		System.out.println("Total de vendedores que receberam comissão de 10% : " + vendedores10);
		System.out.println("A maior comissão paga a um vendedor : R$" + maiorComissao);
		
		

	}

}
