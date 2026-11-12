import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int valor = 0;
		int n = 1;

				while(valor<=0) // controla para evitar nº <= Zero
				{
				System.out.println("Digite um valor : ");
					 valor = input.nextInt();
				}
				while(n<=valor) // controla a impressão até o valor
				{
					System.out.println(n);  
					n=n+1;
				}
			}

	}
