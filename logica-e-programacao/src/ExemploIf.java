import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira sua idade");
		int idade = input.nextInt();
		
		if(idade >= 60) {
			System.out.println("Você já tem idade para tirar a carteira de idoso");
		} else {
			System.out.println("você não tem idade para tirar a carteira");
		}

		input.close();
	}
	

}
