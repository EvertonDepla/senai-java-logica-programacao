//13. Escrever um algoritmo que leia um número n que indica quantos valores devem
//ser lidos a seguir. Para cada número lido, mostre uma tabela contendo o valor
//lido e o fatorial deste valor.
import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos valores serão lidos? ");
        int n = input.nextInt();

        int contador = 1;

        while (contador <= n) {

            System.out.print("Digite um valor: ");
            int valor = input.nextInt();

            int fatorial = 1;
            int i = 1;

            while (i <= valor) {
                fatorial = fatorial * i;
                i++;
            }

            System.out.println("Valor: " + valor + " | Fatorial: " + fatorial);

            contador++;
        }

        input.close();
    }
}
