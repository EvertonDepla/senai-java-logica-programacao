import java.util.Scanner;

public class exercicio13 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o dia: ");
	        int dia = scanner.nextInt();

	        if (dia < 1 || dia > 31) {
	            System.out.println("Erro: dia inválido");
	            return;
	        }

	        System.out.print("Digite o mês: ");
	        int mes = scanner.nextInt();

	        if (mes < 1 || mes > 12) {
	            System.out.println("Erro: mês inválido");
	            return;
	        }

	        System.out.print("Digite o ano: ");
	        int ano = scanner.nextInt();

	        boolean bissexto = (ano % 400 == 0) ||
	                           (ano % 4 == 0 && ano % 100 != 0);

	        int maxDias;

	        if (mes == 2) {
	            if (bissexto) {
	                maxDias = 29;
	            } else {
	                maxDias = 28;
	            }
	        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
	            maxDias = 30;
	        } else {
	            maxDias = 31;
	        }

	        if (dia <= maxDias) {
	            System.out.println("Data válida");
	        } else {
	            System.out.println("Data inválida");
	        }
	    }

}
