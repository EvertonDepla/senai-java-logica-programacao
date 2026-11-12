//4) Faça um programa que se repita por 10 Vezes e peça as seguintes informações
//a) Sexo (O usuário irá digitar 1 para masculino e 2 para feminino)
//b) Idade
//Ao final o programa deverá informar o Número de Homens, O Número de Mulheres, a Média de idade dos Homens e a Média de idade das Mulheres
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero = 0;
		int homem = 0;
		int mulher = 0;
		int idade = 0;
		int idadeHomem = 0;
		int mulherIdade = 0;
		int repete = 1;
		
		while(repete <=10) {
			System.out.println("digite 1 caso seu sexo seja Homem e 2 caso seu sexo seja mulher : ");
			numero = input.nextInt();
			
			if(numero == 1) {
				System.out.println("Digite a idade : ");
				idade = input.nextInt();
				idadeHomem = idadeHomem + idade;
				homem++;
			}
			else if(numero == 2) {
				System.out.println("Digite a idade : ");
				idade = input.nextInt();
				mulherIdade = mulherIdade + idade;
				mulher++;
			}
			repete++;
		}
		System.out.println("O total de homem é : " + homem);
		System.out.println("A média de idade dos homens é : " + (idadeHomem/homem));
		System.out.println("O total de mulheres é : " + mulher);
		System.out.println("A média de idade dss mulher é : " + (mulherIdade/mulher));
		

	}

}
