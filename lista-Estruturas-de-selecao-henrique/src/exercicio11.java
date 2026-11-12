
//Desenvolva um algoritmo para ler o ano de nascimento de 3 irmãos, e escreva uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS ou APENAS IRMÃOS.
//Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais, e apenas irmãos se todas as idades forem diferentes.

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a idade do primeiro irmão : ");
		int idade1 = input.nextInt();
		System.out.println("Digite a idade do segundo irmão : ");
		int idade2 = input.nextInt();
		System.out.println("Digite a idade do terceiro irmão : ");
		int idade3 = input.nextInt();
		
		if(idade1 == idade2 && idade2==idade3) {
			System.out.println("TRIGÊMEOS");
		}
		else if(idade1 == idade2 || idade1 == idade3 || idade2 == idade3) {
			System.out.println("GÊMEOS");
		}
		else {
			System.out.println("APENAS IRMÃOS");
		}
	}

}
