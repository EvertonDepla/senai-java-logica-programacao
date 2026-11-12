import java.util.Scanner;

public class exercicio07 {

	//7) Dadas as coordenadas (X e Y) de um ponto, você deve informar em qual quadrante ele está localizado no plano cartesiano
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de X : ");
		int x = input.nextInt();
		System.out.println("Digite o valor de Y : ");
		int y = input.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("Você está no 1º quadrante");
		}
		else if(x<0 && y>0){
			System.out.println("Você está no 2º quadrante");
		}
		else if(x<0 && y<0){
			System.out.println("Você está no 3º quadrante");
		}
		else if(x>0 && y<0){
			System.out.println("Você está no 4º quadrante");
		}
		
	}

}
