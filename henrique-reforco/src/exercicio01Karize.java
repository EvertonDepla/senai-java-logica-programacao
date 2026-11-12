import java.util.Scanner;

public class exercicio01Karize {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero : ");
		double numero01 = input.nextDouble();
		System.out.println("digite o segundo numero : ");
		double numero02 = input.nextDouble();
		
		System.out.println("Digite a operação : ");
		String operador = input.next();
		
		double conta = 0;
		
		if(operador.equals("+")) {
			conta = numero01 + numero02;
			System.out.println(conta);
		}
		else if(operador.equals("-")) {
			conta = numero01 - numero02;
			System.out.println(conta);
		}
		else if(operador.equals("*")) {
			conta = numero01 * numero02;
			System.out.println(conta);
		}
		else if(operador.equals("/")) {
			conta = numero01 / numero02;
			System.out.println(conta);
		}
	}

}
