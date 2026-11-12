
public class vetorImparPar {

	public static void main(String[] args) {
		
		int[] numero = {5,7,8,22,36,91,67,89,100,105};
		
		for(int i = 0; i<numero.length;i++) {
			
			if(numero[i]%2==0 ) {
				System.out.println("Numero par " + numero[i]);
			}
			else {
				System.out.println("Numero impar " + numero[i]);
			}
		}
	}

}
