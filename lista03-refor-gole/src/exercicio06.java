public class exercicio06 {

	//6) Escreva um algoritmo que calcule e mostre a tabuada do 6, de 1 até 10.
	
	public static void main(String[] args) {
		
		int numero = 6;
		int repete = 1;
		
		while(repete <= 10) {
			int resultado = numero *repete;
			System.out.println(numero + " X " + repete + " = " + resultado);
			repete++;
		}
		

	}

}
