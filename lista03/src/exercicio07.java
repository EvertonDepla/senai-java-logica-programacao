import java.util.Scanner;

public class exercicio07 {

	//7) Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a
	//tabuada de 1 a 10 do valor lido.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int valor = 0;
		int n = 1;
		
	
			while(valor <1 || valor > 10)
			{
				System.out.println("digite um valor de 1 a 10 : ");
				valor = input.nextInt();
			}
			
			while(n<= 10)
			{
				System.out.println(valor + " x " + n + " = " + n*valor);
				n=n+1;
			}
		
		
	}

}
