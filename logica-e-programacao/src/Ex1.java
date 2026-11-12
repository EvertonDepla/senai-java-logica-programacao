import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero : ");
		int num1 = input.nextInt();
		
		System.out.println("Digite o segundo numero : ");
		int num2 = input.nextInt();
		
		int soma = num1 + num2;
		int produto = num1 * num2;
		
		System.out.println("A soma dos 2 numeros é : " + soma);
		System.out.println("O produto dos 2 numero é : " + produto);
		
		input.close();
	}

}
