import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe os votos brancos :");
		int brancos = input.nextInt();
		System.out.println("Informe os votos nulos");
		int nulos = input.nextInt();
		System.out.println("Informe os votos validos");
		int validos = input.nextInt();
		
		int eleitores = 100;
		int brancosVotos =  (brancos*100)/eleitores;
		int nulosVotos =  (nulos*100)/eleitores;
		int validosVotos =  (validos*100)/eleitores;
		
		System.out.println("Percentual de votos brancos : " + brancosVotos + "% \n");
		System.out.println("Percentual de votos nulos : " + nulosVotos + "% \n");
		System.out.println("Percentual de votos validos : " + validosVotos + "% \n");
		
		input.close();

	}

}
