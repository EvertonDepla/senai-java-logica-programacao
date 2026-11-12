import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero maior que 1 :");
		int n = input.nextInt();
		
		for(int i = 1; i<= n; i++) {
			System.out.println(i);
		}

		input.close();
	}

}
