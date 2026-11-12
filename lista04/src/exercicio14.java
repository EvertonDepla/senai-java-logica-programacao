//14. Escrever um algoritmo que leia um número não determinado de valores e
//calcule a média aritmética dos valores lidos, a quantidade de valores positivos,
//a quantidade de valores negativos e o percentual de valores negativos e
//positivos. Mostre os resultados. Página

import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double acumulador = 0;
        int numeroPositivo = 0;
        int numeroNegativo = 0;
        int contador = 0;

        // Digite 0 para encerrar o programa

        while (true) {
            System.out.println("Digite um valor: ");
            double valor = input.nextDouble();

            if (valor == 0) {
                break;
            }

            acumulador = acumulador + valor;

            if (valor > 0) {
                numeroPositivo++;
            }
            else if (valor < 0) {
                numeroNegativo++;
            }

            contador++;
        }

        System.out.println("Quantidade positiva: " + numeroPositivo);
        System.out.println("Porcentagem positiva: " + ((double) numeroPositivo / contador) * 100 + "%");

        System.out.println("Quantidade negativa: " + numeroNegativo);
        System.out.println("Porcentagem negativa: " + ((double) numeroNegativo / contador) * 100 + "%");

        System.out.println("A média é: " + acumulador / contador);

        input.close();
    }
}
