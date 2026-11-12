//5. Construir um algoritmo que calcule a média aritmética de vários valores
//inteiros positivos, lidos externamente. O final da leitura acontecerá quando for lido um valor negativo.

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int armazenaValor = 0;
		int contador = 0;
		
		while(true) {
			
			System.out.println("Digite um valor para calcular a media : ");
			int valor = input.nextInt();
			
			if(valor <0) {
				break;
			}
			
			armazenaValor = valor + armazenaValor;
			contador++;
		}
		System.out.println(armazenaValor/contador);

	}

}
