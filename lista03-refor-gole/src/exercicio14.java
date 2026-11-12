//14) Leia 10 números inteiros e informe quantos são maiores que 50.
import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int repete = 1;
		int valor = 0;
		
		
		while(repete<=10) {
			System.out.println("Informe um numero : ");
			int numero = input.nextInt();
			
			if(numero >=50) {
				valor++;
			}
			repete++;
		}
		System.out.println("numeros maiores que 50 são : " + valor);
	

	}
}
