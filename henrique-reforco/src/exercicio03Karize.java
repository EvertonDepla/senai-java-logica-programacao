import java.util.Scanner;

public class exercicio03Karize {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe seu peso : ");
		double peso = input.nextDouble();
		System.out.println("Informe sua altura : ");
		double altura = input.nextDouble();
		
		double media = peso/ (altura*altura);
		
		if(media >=18.5 && media <= 24.9) {
			System.out.println("Normal");
		}
		else if(media >=25 && media <= 29.9) {
			System.out.println("Sobrepeso");
		}
		else if(media>=30) {
			System.out.println("Obesidade");
		}

	}

}
