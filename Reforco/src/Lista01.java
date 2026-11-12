import java.util.Scanner;

public class Lista01 {

	public static void main(String[] args) {
		//cria um objeto do tipo Scanner (leia)
		Scanner leia = new Scanner(System.in);
		//imprime na tela a frase
		System.out.println("Digite sua idade : ");
		//scaneia o valor digitado
		//o nestInf já avisa que é um inteiro
		int idade = leia.nextInt();
		
		System.out.println("a idade é : "  + idade );
		
		System.out.println("Informe sua altura: ");
		
		double altura = leia.nextDouble();
		
		System.out.println("Sua altura é : " + altura);
		
		
		leia.close();
	}



}
