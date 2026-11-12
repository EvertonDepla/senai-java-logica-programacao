import java.util.Scanner;

public class exercicio01 {

	//1) Dados dois números inteiros distintos descreva um algoritmo para informar qual deles têm o maior valor
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor : ");
		int n1 = input.nextInt();
		System.out.println("Digite o segundo valor : ");
		int n2 = input.nextInt();
		
		if(n1>n2){
			System.out.println("O maior valor é : " + n1);
		}
		else
		{
			System.out.println("O maior valor é : " + n2 );
		}

	}

}
