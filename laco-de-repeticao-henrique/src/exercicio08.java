//8)Um determinado material radioativo perde metade de sua massa a cada 50 segundos.
//Escreva um algoritmo que leia a massa inicial do material em quilogramas (kg) e determine quanto tempo será necessário para que sua massa fique menor que 0,5 gramas.
//Ao final, o programa deve exibir:
//Massa inicial
//Massa final
//Tempo necessário, em segundos

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double massaInicial, massaAtual;
        int tempo = 0;

        System.out.print("Digite a massa inicial em kg: ");
        massaInicial = input.nextDouble();

        massaAtual = massaInicial;

        double limite = 0.0005;

        while (massaAtual >= limite) {
            massaAtual = massaAtual / 2;
            tempo += 50;
        }

        System.out.println("Massa inicial: " + massaInicial + " kg");
        System.out.println("Massa final: " + (massaAtual * 1000) + " gramas");
        System.out.println("Tempo necessario: " + tempo + " segundos");

    }

}
