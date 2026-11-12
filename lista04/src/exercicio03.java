
//3. A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando
//dados sobre o salário e número de filhos. A prefeitura deseja saber:
//a) média do salário da população;
//b) média do número de filhos;
//c) maior salário;
//d) percentual de pessoas com salário até R$100,00.
//O final da leitura de dados se dará com a entrada de um salário negativo. (Use o
//comando ENQUANTO-FAÇA)

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario;
        double somaSalarios = 0;
        double maiorSalario = 0;

        int filhos;
        int somaFilhos = 0;

        int quantidadePessoas = 0;
        int pessoasAte100 = 0;

        while (true) {

            System.out.println("Digite o salário: ");
            salario = input.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.println("Digite a quantidade de filhos: ");
            filhos = input.nextInt();

            somaSalarios += salario;

            somaFilhos += filhos;

            quantidadePessoas++;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario <= 100) {
                pessoasAte100++;
            }
        }

        if (quantidadePessoas > 0) {

            double mediaSalario = somaSalarios / quantidadePessoas;
            double mediaFilhos = (double) somaFilhos / quantidadePessoas;
            double percentualAte100 = (double) pessoasAte100 / quantidadePessoas * 100;

            System.out.println("Média do salário: R$ " + mediaSalario);
            System.out.println("Média de filhos: " + mediaFilhos);
            System.out.println("Maior salário: R$ " + maiorSalario);
            System.out.println("Percentual com salário até R$100: " + percentualAte100);
        }

        input.close();
    }
}
