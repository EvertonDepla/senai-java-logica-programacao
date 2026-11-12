//13) Leia a idade de 8 pessoas e informe quantas possuem 18 anos ou mais.
import java.util.Scanner;
	public class exercicio13 {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			
			int repete = 1;
			int idade = 0;
			
			
			while(repete<=8) {
				System.out.println("Informe uma idade : ");
				int numero = input.nextInt();
				
				if(numero >=18) {
					idade++;
				}
				repete++;
			}
			System.out.println("Numero de par : " + idade);
		

		}
	}

