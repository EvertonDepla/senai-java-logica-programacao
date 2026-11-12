import java.util.Scanner;

public class exercicio02Karize {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String login = "";
		String senha = "";
		int repete = 0;
		
		while(repete <=2) {
			
			System.out.println("Digite seu login: ");
			login = input.next();
			System.out.println("Digite sua senha: ");
			senha = input.next();
			
			if(login.equals("everton") && senha.equals("everton")) {
				System.out.println("BEM VINDO EVERTON");
				break;
			}
			else if(repete == 2) {
				System.out.println("VOCÊ ERROU O LOGIN OU A SENHA 3 VEZES, CONTA BLOQUEADA");
			}
			else {
				System.out.println("TENTE NOVAMENTE");
			}
			repete++;
			
		}
		
		

	}

}
