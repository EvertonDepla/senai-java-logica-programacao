import java.util.Scanner;

public class treino01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe sua idade :");
		int idade = input.nextInt();
		
		if(idade >=18) {
			System.out.println("Você é maior de idade");
		}else {
			System.out.println("você é de menor");
		}

	}

}
