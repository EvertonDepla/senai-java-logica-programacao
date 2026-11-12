import java.util.Scanner;

//Faça uma calculadora.
//O usuário entra com dois números e depois com a operação desejada.
//Caso o número da operação seja 1: some os dois números.
//Caso seja 2: subtraia os dois números.
//Caso seja 3: multiplique os dois números.
//Caso seja 4: divide os dois números.

public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("DIgite o primeiro numero : ");
		int n1 = input.nextInt();
		System.out.println("DIgite o segundo numero : ");
		int n2 = input.nextInt();
		System.out.println("DIgite o numero da operação que deseja : ");
		int operacao = input.nextInt();
		
		if(operacao == 1) {
			int soma = n1+n2;
			System.out.println("A soma é : " + soma);
			
		}
		else if(operacao == 2) {
			int subtrair = n1-n2;
			System.out.println("A subtração é : " + subtrair);
		}
		else if(operacao == 3) {
			int multiplique = n1*n2;
			System.out.println("A multiplicação é : " + multiplique);
		}
		else if(operacao == 4) {
			int dividir = n1/n2;
			System.out.println("A divisão é : " + dividir);
		}
	}

}
