//3)Declare um vetor de inteiros com 10 posições. Em seguida, solicite ao usuário que informe um número e o índice em que deseja armazená-lo no vetor.
//O algoritmo deverá inserir o número na posição indicada pelo usuário e, ao final, 
//exibir todo o conteúdo do vetor para que seja possível visualizar o valor armazenado.

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor[] = new int[10];
        int numero = 0;
        int posicao = 0;

        System.out.println("Informe um número inteiro:");
        numero = input.nextInt();

        System.out.println("Informe em qual posição deseja armazená-lo (0 a 9):");
        posicao = input.nextInt();

        valor[posicao] = numero;

        System.out.println("Conteúdo do vetor:");

        for (int i = 0; i < valor.length; i++) {
            System.out.println("Posição " + i + ": " + valor[i]);
        }

        input.close();
    }
}
