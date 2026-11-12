import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro lado : ");
		int lado01 = input.nextInt();
		System.out.println("Digite o valor do segundo lado : ");
		int lado02 = input.nextInt();
		System.out.println("Digite o valor do terceiro lado : ");
		int lado03 = input.nextInt();
		
		if(lado01 == lado02 && lado01 == lado03) {
			System.out.println("Triangulo Equilatero");
		}
		else if(lado01 !=lado02 && lado01!=lado03 && lado02 != lado03) {
			System.out.println("Triangulo Escaleno");
		}
		else {
			System.out.println("triangulo Isósceles");
		}
	}

}
