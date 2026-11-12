import java.util.Scanner;

//6) Dada a idade de um nadador descreva um algoritmo que o classifique em uma das seguintes categorias:
//Pré-mirim: 5 - 7 anos
//Mirim: 8 - 10 anos
//Infantil: 11 - 13 anos
//Infanto-juvenil: 14 - 17 anos
//Juvenil: 18 - 20 anos
//Adulto: maiores de 21 anos

public class exercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a sua idade : ");
		int idade = input.nextInt();
		
		if(idade >=5 && idade <=7) {
			System.out.println("pré-mirim");
		}
		else if(idade >=8 && idade <=10){
			System.out.println("Mirim"); 
		}
		else if(idade >=11 && idade <=13){
			System.out.println("Infantil"); 
		}
		else if(idade >=14 && idade <=17){
			System.out.println("infanto-juvenil"); 
		}
		else if(idade >=18 && idade <=20){
			System.out.println("Juvenil"); 
		}
		else if(idade >=21){
			System.out.println("Adulto"); 
		}
		else if(idade < 5){
			System.out.println("Idade invalida"); 
		}
	}

}
