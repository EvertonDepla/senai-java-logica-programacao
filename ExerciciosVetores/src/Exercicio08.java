//8)Declare um vetor de inteiros com 5 posições e atribua um valor a cada um de seus elementos.
//Em seguida, desenvolva um algoritmo que inverta a ordem dos elementos do vetor, de modo
//que o primeiro elemento passe a ocupar a última posição, o segundo passe a ocupar a
//penúltima posição e assim sucessivamente.
//Ao final, exiba o vetor original e o vetor com os elementos em ordem invertida.

import java.util.Arrays;

public class Exercicio08 {

	public static void main(String[] args) {
		
		int vetor[] = {1,2,3,4,5};
		int invertVetor[] = new int[vetor.length];
		
		for(int i = vetor.length-1; i>=0; i--) {
			invertVetor[vetor.length - 1 - i] = vetor[i];
			
		}
		System.out.println(Arrays.toString(vetor));
		System.out.println(Arrays.toString(invertVetor));
		
	}

}
