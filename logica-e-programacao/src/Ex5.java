import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o nome do vendedor : ");
		String vendedor = input.next();
		
		System.out.println("Informe seu salario fixo : ");
		double salarioFixo = input.nextDouble();
		
		System.out.println("Informe quantas vendas foram efetuadas : ");
		double vendasEfetuadas = input.nextDouble();
		
		double comissao = salarioFixo + (vendasEfetuadas*0.15);
		
		System.out.println("O vendedor : " + vendedor + " Recebeu o salario com comissao de 15% de : " + comissao);
		
		input.close();

	}

}
