import java.util.Scanner;

public class exercicio09 {

	//9) Leia 10 números inteiros e informe quantos estão no intervalo [20, 50] e quantos estão fora desse
	//intervalo. Os valores 20 e 50 devem ser considerados dentro do intervalo.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite numeros entre 20 e 50 : ");
		int numero = input.nextInt();
		int entre20e50 = 0;
		int fora20e50 = 0;
		int repete = 1;
		
		while(repete<=10) {
			
			System.out.println("Digite numeros entre 20 e 50 : ");
			numero = input.nextInt();
			if(numero >=20 && numero <= 50) {
				entre20e50 = entre20e50 + 1;
				
			}
			else {
				fora20e50 = fora20e50 + 1;
			}
			
			repete++;
		}
		System.out.println("numeros entre 20 e 50 :  " + entre20e50);
		System.out.println("numeros fora 20 e 50 :  " + fora20e50);

	}

}
