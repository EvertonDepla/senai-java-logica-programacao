import java.util.Scanner;

public class exercicio04 {

	//4) Leia um número inteiro N e mostre todos os números inteiros entre 1 e N. Considere inicialmente
	//que N será maior que zero.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um numero maior que zero : ");
		int numero = input.nextInt();
		int n = 1;
		
		while(n <= numero) {
			System.out.println(n);
			n++;
		}

	}

}
