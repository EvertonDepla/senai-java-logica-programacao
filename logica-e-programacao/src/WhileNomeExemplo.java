import java.util.Scanner;

public class WhileNomeExemplo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu nome Everton : ");
		String nome = input.next();
		
		while(!nome.equalsIgnoreCase("everton")) {
			System.out.println("Digite seu nome Everton : ");
			nome = input.next();
		}
		System.out.println("Bem vindo " + nome);
		
		

	}

}
