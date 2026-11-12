//6)Chico possui 1,50 m de altura e cresce 2 cm por ano.
//Zé possui 1,10 m de altura e cresce 3 cm por ano.
//Escreva um algoritmo que calcule quantos anos serão necessários para que Zé fique mais alto que Chico.
public class exercicio06 {

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

