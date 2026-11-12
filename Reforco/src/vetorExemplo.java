
public class vetorExemplo {

	public static void main(String[] args) {
		
		//int[] numeros = {1,2,3,4,5,6,7,8,9,10};
		int[] numero = {15,30,72,54,90,100};
		int numMaior = numero[0];
        int numMenor = numero[0];
		
		for(int i = 0; i<6; i++) {
			
			if(numMaior<numero[i]) {
				numMaior = numero[i];
				
			}
			else if(numMenor>numero[i]) {
				numMenor = numero[i];
			}
		}
		System.out.println(numMenor);
		System.out.println(numMaior);
		//System.out.println(" vetor na posição 5 : " + numeros[5]);
		
		//for(int i = 0; i<10; i++) {
			//System.out.println(numeros[i]);
		//}

	}

}
