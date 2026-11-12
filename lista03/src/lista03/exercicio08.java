package lista03;

import java.util.Scanner;

//8) Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS.

public class exercicio08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = 1;
		int negativo = 0;
		
		while(n <= 10)
		{
			System.out.println("Escreva um valor : ");
			int valor = input.nextInt();
		
		if(valor < 0)
		{
			negativo = negativo + 1;
		}
		n=n+1;
		}
		System.out.println(negativo);
	}
    

}
