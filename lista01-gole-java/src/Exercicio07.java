import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe seu salário fixo : ");
		double salFixo = input.nextDouble();
		System.out.println("Informe a quantidade de carros vendidos : ");
		int qtaCarros = input.nextInt();
		System.out.println("Informe o total das sua vendas : ");
		double totVendas = input.nextDouble();
		System.out.println("O valor pago por carro vendido : ");
		double comissao = input.nextDouble();
		double qta=qtaCarros*comissao;
		double vendas=totVendas*0.05;
		double salFinal=qta+vendas+salFixo;
		System.out.println("Seu salário final é : "+salFinal);
		
		input.close();

	}

}
