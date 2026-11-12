
//6. Em uma eleição presidencial existem quatro candidatos. Os votos são
//informados através de códigos. Os dados utilizados para a contagem dos votos
//obedecem à seguinte codificação:
//- 1,2,3,4 = voto para os respectivos candidatos;
//- 5 = voto nulo;
//- 6 = voto em branco;
//Elabore um algoritmo que leia o código do candidado em um voto. Calcule e escreva:
//- total de votos para cada candidato;
//- total de votos nulos;
//- total de votos em branco;
//Como finalizador do conjunto de votos, tem-se o valor 0.

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
	    int numero1 = 0;
	    int numero2 = 0;
	    int numero3 = 0;
	    int numero4 = 0;
	    int branco = 0;
	    int nulo = 0;
	    
	    while(true) {
	    	
	    	System.out.println("Digite o numero de voto : ");
		    int numeroVoto = input.nextInt();
		    
		    if(numeroVoto == 0) {
		    	break;
		    }
		    
		    if(numeroVoto == 1) {
		    	numero1++;
		    }
		    else if(numeroVoto == 2) {
		    	numero2++;
		    }
		    else if(numeroVoto == 3) {
		    	numero3++;
		    }
		    else if(numeroVoto == 4) {
		    	numero4++;
		    }
		    else if(numeroVoto == 5) {
		    	nulo++;
		    }
		    else if(numeroVoto == 6) {
		    	branco++;
		    }
	    }
	    System.out.println("Votos no primeiro candidato : " + numero1);
	    System.out.println("Votos no segundo candidato : " + numero2);
	    System.out.println("Votos no terceiro candidato : " + numero3);
	    System.out.println("Votos no quarto candidato : " + numero4);
	    System.out.println("Votos no nulos : " + nulo);
	    System.out.println("Votos em branco : " + branco);

	}

}
