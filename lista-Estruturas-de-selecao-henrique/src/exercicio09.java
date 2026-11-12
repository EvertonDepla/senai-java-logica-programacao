
//9)Faça um algoritmo que o usuário entre com um char.
//Determine se esse char é uma consoante ou vogal.

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite uma consoante ou vogal : ");
		char letra = Character.toLowerCase(input.next().charAt(0));
		
		if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
			System.out.println("é uma vogal");
		}else {
			System.out.println("é uma consoante");
		}
	}

}
