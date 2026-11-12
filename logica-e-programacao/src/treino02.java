import java.util.Scanner;

public class treino02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o tamanho da primeira bola :");
		int bola01 = input.nextInt();
		System.out.println("Informe o tamanho da segunda bola :");
		int bola02 = input.nextInt();
		System.out.println("Informe o tamanho da terceira bola :");
		int bola03 = input.nextInt();
		
		if(bola01 > bola02 && bola01 > bola03) {
			System.out.println(bola01);
		}else if(bola02 > bola01 && bola02 > bola03) {
			System.out.println(bola02);
		}else if(bola03 > bola01 && bola03 > bola01) {
			System.out.println(bola03);
		}

	}

}