import java.util.Scanner;

public class ExemploEntradaUsuario {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe seu nome : ");
		String nome = input.next();
		
		System.out.println("Informe a sua idade : ");
		int idade = input.nextInt();
		
		System.out.println("Informe sua altura : ");
		double altura = input.nextDouble();
		
		System.out.println("Seu nome é : " + nome);
		System.out.println("Sua idade é : " + idade);
		System.out.println("Sua altura : " + altura);
		
		input.close();

	}

}
