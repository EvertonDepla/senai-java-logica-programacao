import java.util.Scanner;

public class exercicio09 {

	//9) Ler 10 valores e escrever quantos desses valores lidos estão no intervalo
	//[10,20] (inlcuindo os
	//valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = 1;
		int dentro = 0;
		int fora = 0;
		
		while(n <= 10)
		{
			System.out.println("Digite um valor : ");
			int valor = input.nextInt();
			
			if(valor >=10 && valor <= 20)
			{
				dentro = dentro + 1;
			}
			else
			{
				fora = fora + 1;
			}
			n = n+1;
		}
		
				System.out.println("Números dentro do intervalo : " + dentro);
				System.out.println("Números fora   do intervalo : " + fora);
	}

}
