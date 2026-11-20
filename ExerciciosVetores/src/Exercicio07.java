//7)Declare um vetor de inteiros com 5 posições e atribua um valor a cada um de seus elementos.
//Em seguida, desenvolva um algoritmo que percorra o vetor e modifique seus valores de acordo
//com as seguintes regras:
//• Valores ímpares: devem receber um aumento de 5%.
//• Valores pares: devem receber um aumento de 2%.
//Após realizar todas as modificações, exiba o vetor com os valores atualizados.

import java.util.Arrays;

public class Exercicio07 {

	public static void main(String[] args) {
		
		double vetor[] = {100,101,300,401,500};
		
		for(int i = 0; i<vetor.length; i++) {
			
			if(vetor[i]%2==0) {
				vetor[i] = vetor[i] +(vetor[i] * 0.02);	
			}
			else {
				vetor[i] = vetor[i] +(vetor[i] * 0.05);
			}
		}
		System.out.println(Arrays.toString(vetor));
	}

}
