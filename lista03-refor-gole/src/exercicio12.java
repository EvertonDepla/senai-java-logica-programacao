//12) Leia 10 números e calcule a soma somente dos valores positivos informados.

import java.util.Scanner;

public class exercicio12 {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int repete = 1;
		int acumula = 0;
		
		
		while(repete<=10) {
			System.out.println("Informe um numero : ");
			int numero = input.nextInt();
			
			if(numero >=0) {
				acumula = acumula + numero;
			}
			repete++;
		}
		System.out.println("a soma de numeros pares é : " + acumula);

	}

}
