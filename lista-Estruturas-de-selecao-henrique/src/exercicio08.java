
//O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma
//pessoa está no peso ideal. O IMC é determinado pela divisão da massa do indivíduo pelo
//quadrado de sua altura, onde a massa está em quilogramas e a altura está em metros, de
//acordo com a fórmula:
//IMC = Massa / Altura²
//Faça um algoritmo para classificar o IMC de acordo com a seguinte tabela:
//< 18.5 Magreza
//18.5 – 24.9 Saudável
//25.0 – 29.9 Sobrepeso
//30.0 – 34.9 Obesidade Grau I
//35.0 – 39.9 Obesidade Grau II (severa)
//>= 40.0 Obesidade Grau III (mórbida)

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("digite seu peso : ");
		double peso = input.nextDouble();
		System.out.println("Digite sua altura : ");
		double altura = input.nextDouble();
		
		double imc = peso / (altura*altura);
		
		if(imc <18.5) {
			System.out.println("Magreza seu IMC é de : " + imc );
		}
		else if(imc>=18.5 && imc <= 24.9) {
			System.out.println("Saúdavel seu IMC é de : " + imc );
		}
		else if(imc>=25 && imc <= 29.9) {
			System.out.println("Sobrepeso seu IMC é de : " + imc );
		}
		else if(imc>=30 && imc <= 34.9) {
			System.out.println("Obesidade Grau I seu IMC é de : " + imc );
		}
		else if(imc>=35 && imc <= 39.9) {
			System.out.println("Obesidade Grau II (severa) seu IMC é de : " + imc );
		}
		else if(imc>=40) {
			System.out.println("Obesidade Grau III (mórbida) seu IMC é de : " + imc );
		}

	}

}
