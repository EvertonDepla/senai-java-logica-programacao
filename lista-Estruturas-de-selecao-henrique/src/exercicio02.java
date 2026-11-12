import java.util.Scanner;

//2) Dados dois valores inteiros, escreva um algoritmo que informe se o primeiro número é múltiplo do segundo.

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor : ");
		int n1 = input.nextInt();
		System.out.println("Digite o segundo valor : ");
		int n2 = input.nextInt();
		int resto = n1%n2;
		
		if(resto == 0){
			System.out.println("O primeiro número é multiplo do segundo");
		}
		else {
			System.out.println("O primeiro número não é multiplo do segundo");
		}

	}

}
