import java.util.Scanner;

public class ExercicioLogin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu nome de login : ");
		String nome = input.next();
		
		if(nome.equals("Everton") || nome.equals("everton")) {
			System.out.println("Login efetuado");
		}
		else {
			System.out.println("Login Invalido");;
		}

	}

}
