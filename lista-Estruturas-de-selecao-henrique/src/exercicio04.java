
//Faça um algoritmo que leia um caractere.Caso seja digitada a letra 'M' escreva “Masculino”.
//Se for digitada a letra 'F' escreva “Feminino”. Se for informado 'I' escreva “Não Informado”.
//Qualquer outra letra digitada escreva “Entrada Incorreta”.

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a letra do seu sexo : ");
		char sexo = input.next().charAt(0);
		
		if(sexo == 'f' || sexo == 'F') {
			System.out.println("Feminino");
		}
		else if(sexo == 'h' || sexo == 'H'){
			System.out.println("Masculino");
		}
		else if(sexo == 'i' || sexo == 'I'){
			System.out.println("Não Informado");
		}
		else {
			System.out.println("Entrada Incorreta");
		}

	}

}
