import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu primeiro nome : ");
		String primeiroNome = input.next();
		System.out.println("Digite seu sobre nome : ");
		String segundoNome = input.next();
		System.out.println("Seu nome completo é " + primeiroNome + " " + segundoNome);

	}

}
