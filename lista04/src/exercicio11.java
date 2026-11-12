import java.util.Scanner;
	public class exercicio11 {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n, a1, r;
	        int termo;
	        int soma = 0;

	        System.out.print("Digite o número de termos: ");
	        n = sc.nextInt();

	        System.out.print("Digite o primeiro termo: ");
	        a1 = sc.nextInt();

	        System.out.print("Digite a razão: ");
	        r = sc.nextInt();

	        termo = a1;

	        for (int i = 1; i <= n; i++) {
	            System.out.print(termo + " ");

	            soma = soma + termo;

	            termo = termo + r;
	        }

	        System.out.println();
	        System.out.println("Soma dos elementos: " + soma);

	        sc.close();
	    }
	}
