//4. Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10
//metro e cresce 3 centímetros por ano. Construa um algoritmo que calcule e
//imprima quantos anos serão necessários para que Zé seja maior que Chico.

public class exercicio04 {

	public static void main(String[] args) {
		
		double chico = 1.50;
		double ze = 1.10;
		int anos = 0;
		
		while(chico >= ze) {
			
			ze = ze + 0.03;
			chico = chico +0.02;
			anos++;
		}
		System.out.println("Chico tem de altura : " + chico);
		System.out.println("Ze tem de altura : " + ze);
		System.out.println("Demorou o total de anos de :  " + anos);

	}

}
