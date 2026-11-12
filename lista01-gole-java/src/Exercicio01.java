import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero : ");
		int numeroAnt = input.nextInt() -1; 
		System.out.println("Seu numero anterior é : " +numeroAnt);
		
		input.close();

	}

}
