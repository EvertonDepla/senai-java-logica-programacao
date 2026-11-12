//2)Declare um vetor de inteiros com 5 posições e atribua um valor a cada elemento.
//Em seguida, desenvolva um algoritmo que percorra o vetor de trás para frente,
//exibindo seus elementos em ordem inversa àquela em que foram armazenados.
public class exercicio02 {

	public static void main(String[] args) {

		int numeros[] = {1,2,3,4,5};
		
		for(int i = numeros.length - 1; i>=0; i--) {
			System.out.println(numeros[i]);
		}
		

	}

}
