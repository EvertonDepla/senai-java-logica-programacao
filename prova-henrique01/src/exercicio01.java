//1)Desenvolva um programa que solicite ao usuário os valores de precisão medidos por três máquinas de uma indústria.
//Compare os valores informados e exiba o diagnóstico correspondente:
//Máquinas precisas: se os três valores forem iguais, significa que as máquinas estão operando com a mesma precisão.
//Uma máquina precisa de ajuste: se exatamente dois valores forem iguais, significa que uma das máquinas precisa ser ajustada.
//Todas as máquinas desajustadas: se os três valores forem diferentes, significa que todas as máquinas precisam de ajuste.
//O programa deve ler os três valores, realizar as comparações necessárias e exibir o diagnóstico final.

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro valor de precisão : ");
		int precisao01 = input.nextInt();
		System.out.println("Digite o valor do segundo valor de precisão : ");
		int precisao02 = input.nextInt();
		System.out.println("Digite o valor do terceiro valores de precisão : ");
		int precisao03 = input.nextInt();
		
		if(precisao01 == precisao02 && precisao01 == precisao03) {
			System.out.println("Máquinas precisas");
		}
		else if(precisao01 !=precisao02 && precisao01!=precisao03 && precisao02 != precisao03) {
			System.out.println("Todas as máquinas desajustadas");
		}
		else if(precisao01 ==precisao02 || precisao01==precisao03 || precisao02 == precisao03){
			System.out.println("Uma máquina precisa de ajuste");
		}
		
		input.close();
	}

}
