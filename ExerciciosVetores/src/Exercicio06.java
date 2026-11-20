//6)Declare um vetor de inteiros com 5 posições e atribua um valor a cada elemento.
//Após preencher o vetor, identifique quais elementos possuem valores maiores que a média aritmética dos elementos do vetor.
//Ao final, exiba a média e todos os valores que estão acima dela.
public class Exercicio06 {

	public static void main(String[] args) {
		
		int vetor[] = {1,2,3,4,5};
		double media= 0;
		
		for(int i = 0; i<vetor.length;i++) {
			
			media = media +vetor[i]; 
		}
		
		media = media/vetor.length;
		System.out.println("A media é : " + media);
		
		for(int i = 0; i<vetor.length;i++) {
			
			if(media<vetor[i]) {
				System.out.println("O valor a seguir é maior que a media : " + vetor[i]);
			}
		}

	}

}
