import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o valor de raio");
		double raio = input.nextDouble();
		
		//double area = 3.14 * raio * raio;
		
		double area = 3.14 * Math.pow(raio, 2);
		
		System.out.println("O valor de area é de : " +  area);
		
		input.close();

	}

}
