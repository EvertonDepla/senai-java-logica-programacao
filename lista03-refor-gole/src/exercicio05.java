import java.util.Scanner;

public class exercicio05 {

	//5) Modifique o exercício anterior para aceitar somente valores maiores que zero. Enquanto o usuário
	//informar zero ou um número negativo, solicite um novo valor.
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um numero maior que zero : ");
		int numero = input.nextInt();
		int n = 1;
		
		while(numero <= 0) {
			System.out.println("Informe um numero maior que zero : ");
			numero = input.nextInt();
		}
		
		while(n <= numero) {
			System.out.println(n);
			n++;
		}

	}

}
