//1) Escrever um algoritmo que lê 10 valores para Z, um de cada vez, e conta quantos destes valores são positivos, escrevendo esta informação.
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int z = 0;
		int repete = 1;
		int positivo = 0;
		
		while(repete<=10) {
			System.out.println("Digite um valor : ");
			z = input.nextInt();
			if(z>0) {
				positivo++;
			}
			repete++;
		}
		System.out.println("O total de valores negativos é : " + positivo);

	}

}
