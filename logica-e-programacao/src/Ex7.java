import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o valor de A : ");
		double a = input.nextDouble();
		
		System.out.println("Informe o valor de B : ");
		double b = input.nextDouble();
		
		System.out.println("Informe o valor de C : ");
		double c = input.nextDouble();
		
		double triangulo = (a * c) / 2;
		System.out.println("O valor do triangulo é : " + triangulo);
		
		double circulo   = 3.14 * c * c;
		System.out.println("O valor do circulo é : "  + circulo);
		
		double trapezio  = ((a + b) * c) / 2;
		System.out.println("O valor do trapezio é : " + trapezio);
		
		double quadrado  = b * b;
		System.out.println("O valor do quadrado é : " + quadrado);
		
		double retangulo = a * b;
		System.out.println("O valor do retangulo é : " + retangulo);
		
		input.close();

	}

}
