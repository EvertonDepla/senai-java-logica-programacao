import java.util.Scanner;

//3) Faça um algoritmo que imprima "nome correto" caso o nome inserido seja o seu.

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu nome : ");
		String nome = input.next();
		
		if(nome.equalsIgnoreCase("Everton")) {
			System.out.println("Nome correto");
		}else
		{
			System.out.println("Nome incorreto");
		}

	}

}
