import java.util.Scanner;

public class exercicio10 {

	//10)Ler 10 valores, calcular e escrever a média aritmética desses valores lidos.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double n = 1;
		double soma = 0;
		
		while(n <= 10)
		{
			System.out.println("Digite um valor");
			double valor = input.nextInt();
			soma = soma + valor;
			n = n+1;
		}
		double media = soma/10;
		
		System.out.println("Sua medua é : " + media);
	}

}
