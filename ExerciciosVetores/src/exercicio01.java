//1)Faça um algoritmo que atribua valores a um vetor de 100 posições de acordo com o quadrado do seu índice.
//Ex:
//[0] = 0
//[1] = 1
//[2] = 4
//[3] = 9
public class exercicio01 {

	public static void main(String[] args) {
		
		int numeros[] = new int[100]; 
		
		for(int i = 0; i<numeros.length; i++) {
			int multiplica = i*i;
			System.out.println(multiplica);
		}

	}

}
