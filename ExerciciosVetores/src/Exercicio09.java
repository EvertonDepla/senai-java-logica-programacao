//9) Declare dois vetores de inteiros com 5 posições e atribua um valor a cada um de seus elementos. 
//Após preencher os dois vetores, crie um terceiro vetor, também com 5 posições, no qual cada 
//elemento deverá armazenar a soma dos valores que ocupam a mesma posição nos dois vetores originais. 
//Ao final, exiba na tela os três vetores: o primeiro, o segundo e o vetor resultante da soma.

import java.util.Arrays;

public class Exercicio09 {

	public static void main(String[] args) {
		
		int vetor[] = {1,2,3,4,5};
		int vetor2[] = {2,4,6,8,10};
		int vetor3[] = new int[vetor.length];
		
		for(int i = 0; i<vetor.length; i++) {
			vetor3[i] = vetor[i] + vetor2[i];
			
		}
		System.out.println(Arrays.toString(vetor));
		System.out.println(Arrays.toString(vetor2));
		System.out.println(Arrays.toString(vetor3));

	}

}
