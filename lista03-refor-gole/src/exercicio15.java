//15) Leia 5 números e apresente, ao final, a soma e a média dos valores informados.
import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int repete = 1;
		double soma =0;
		
		while(repete <=5 ) {
			
			
			System.out.println("digite um numero : ");
			double notas = input.nextDouble();
			soma = soma + notas;
			repete++;
			
		}
		System.out.println("A soma dos valores é " + soma + " e sua media é : " + (soma/5));

	}

}
