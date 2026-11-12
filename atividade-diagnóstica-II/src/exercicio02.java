//2) Escreva um algoritmo que leia 10 valores inteiros e ao final exiba:
//a) a soma dos números positivos;
//b) a quantidade de valores negativos.
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int valor = 0;
		int repete = 1;
		int somaPositivo = 0;
		int acumulaNegativo = 0;
		
		while(repete <=10) {
			System.out.println("Digite um valor : ");
			valor = input.nextInt();
			
			if(valor>0) {
				somaPositivo = somaPositivo + valor;
			}
			else if(valor>0) {
				acumulaNegativo++;
			}
			repete++;
		}
		System.out.println("a soma dos números positivos é :  "+ somaPositivo);
		System.out.println("a quantidade de valores negativos é : " + acumulaNegativo);
	}

}
