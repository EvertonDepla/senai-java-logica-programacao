import java.util.Scanner;

public class exercicio08 {

	//8) Leia 12 números inteiros e informe quantos números são positivos e quantos são negativos.
	//Desconsidere o zero das duas contagens.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite 12 numeros inteiros : ");
		int numero = input.nextInt();
		int repete = 1;
		int positivo = 0;
		int negativo = 0;
		
		while(repete <= 12) {
			System.out.println("Digite 12 numeros inteiros : ");
			numero = input.nextInt();
			
			
			if(numero >0) {
				positivo = positivo + 1;
			}
			else if(numero <0) {
				negativo = negativo + 1;
			}
			repete++;
		}
		System.out.println("Numeros positivos" + positivo);
		System.out.println("Numeros negativos" + negativo);

	}

}
