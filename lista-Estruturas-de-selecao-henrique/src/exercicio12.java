//Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha.
//Faça um algoritmo para ler as idades dos filhos e exibir quem é o mais velho, o irmão do meio e o caçula da família. Suponha que não haja empates.

import java.util.Scanner;

public class exercicio12 {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a idade do Marquinhos : ");
		int irmao1 = input.nextInt();
		System.out.println("Digite a idade do Zezinho : ");
		int irmao2 = input.nextInt();
		System.out.println("Digite a idade do Luluzinha : ");
		int irmao3 = input.nextInt();
		
		if(irmao1 > irmao2 && irmao1 >  irmao3) {
			System.out.println("Marquinhos é o mais velho");
		}
		else if(irmao2 > irmao1 && irmao2 >  irmao3) {
			System.out.println("zezinho é o mais velho");
		}
		else {
			System.out.println("luluzinha é a mais velha");
		}
	}

}
