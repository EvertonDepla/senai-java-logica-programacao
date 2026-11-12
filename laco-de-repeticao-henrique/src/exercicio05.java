//5)Escreva um algoritmo que leia um número inteiro fornecido pelo usuário e calcule o seu fatorial.
//Por exemplo:
//5! = 5 × 4 × 3 × 2 × 1 = 120

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor para saber o seu fatorial: ");
        int numero = input.nextInt();

        int resultado = 1;
        int repete = numero;

        while (repete >= 1) {

            resultado = resultado * repete;
            repete--;
        }

        System.out.println(numero + "! = " + resultado);

        input.close();
    }
}
