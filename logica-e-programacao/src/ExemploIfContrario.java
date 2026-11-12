import java.util.Scanner;

public class ExemploIfContrario {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira sua idade");
		int idade = input.nextInt();
		
		if(idade <= 60) {
			System.out.println("você não tem idade para tirar a carteira");
		} else {
			System.out.println("Você já tem idade para tirar a carteira de idoso");
		}
		input.close();

	}

}
