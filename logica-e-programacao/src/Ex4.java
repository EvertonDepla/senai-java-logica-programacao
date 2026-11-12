import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota : ");
		double nota1 = input.nextDouble();
		System.out.println("Digite a segunda nota : ");
		double nota2 = input.nextDouble();
		
		double mediaPonderada = ((nota1 * 3.5) + (nota2 * 6.5)) / (3.5 + 6.5);
		
		System.out.println("Sua media ponderada é : " +  mediaPonderada);

		input.close();
	}

}
