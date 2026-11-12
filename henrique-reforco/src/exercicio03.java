import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String opcao = "s";
		
		while(opcao.equalsIgnoreCase("s")) {
			System.out.println("Informe o nome do vendedor : ");
			String nome = sc.nextLine();
			
			System.out.println("Informe o Valor total de vendas no mÊs R$ ");
			double vendas = sc.nextDouble();
			
			double salario = (vendas * 17)/100;
			
			System.out.println("Nome: " + nome);
			System.out.println("Vendas: R$" + vendas);
			System.out.println("Salario: R$" + salario);
			
			sc.nextLine();
			
			System.out.println("Deseja informar outro vendedor : 's' ou 'n' : ");
			opcao = sc.nextLine().toLowerCase();
		}

	}

}
