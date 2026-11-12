import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um numero para aparecer ele e os 20 numeros inteiros adiante : ");
		int numero = input.nextInt();
		int repete = 0;
		
		while(repete <=20) {
			System.out.println(numero);
			numero = numero + 1;
			repete++;
		}

	}

}
