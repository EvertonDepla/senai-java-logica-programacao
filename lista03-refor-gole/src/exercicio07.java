import java.util.Scanner;

public class exercicio07 {

	//7) Leia um número inteiro entre 2 e 9. Caso seja informado um valor fora desse intervalo, solicite
	//novamente. Depois, mostre a tabuada desse número de 1 até 10.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero entre 2 e 9 : ");
		int numero = input.nextInt();
		int repete = 1;
		
		while(numero <=1 || numero>=10){
			System.out.println("Digite um numero entre 2 e 9 : ");
			numero = input.nextInt();
		}
		while(repete <= 10) {
			int multiplicar = numero * repete;
			System.out.println(numero + " X " + repete + " = " + multiplicar);
			repete++;
		}

	}
}
