
import java.util.Scanner;

public class ExercicioExtra {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Solicita e guarda o nome do primeiro candidato
		System.out.println("Insira o nome do primeiro candidato");
		String candidato1 = input.next();

		// Solicita e guarda o nome do segundo candidato
		System.out.println("Insira o nome do segundo candidato");
		String candidato2 = input.next();

		// Solicita e guarda a quantidade total de eleitores
		System.out.println("Insira a quantidade de eleitores");
		int eleitores = input.nextInt();

		// Variáveis contadoras que começam com zero
		int votosCandidato1 = 0;
		int votosCandidato2 = 0;
		int votosNulos = 0;

		// Laço de repetição (for) que roda uma vez para cada eleitor
		for (int i = 0; i < eleitores; i++) {
			System.out.println("Informe o nome do candidato");
			String nomeVoto = input.next();

			// Compara o texto digitado com o nome do candidato 1
			if (nomeVoto.equals(candidato1)) {
				votosCandidato1++; // Adiciona +1 voto ao candidato 1
			}
			// Compara o texto digitado com o nome do candidato 2
			else if (nomeVoto.equals(candidato2)) {
				votosCandidato2++; // Adiciona +1 voto ao candidato 2
			}
			// Se não for igual a nenhum dos dois, conta como voto nulo
			else {
				votosNulos++; // Adiciona +1 voto nulo
			}
		}

		// Exibe o placar final da votação
		System.out.println("O candidato " + candidato1 + " teve " + votosCandidato1 + " votos");
		System.out.println("O candidato " + candidato2 + " teve " + votosCandidato2 + " votos");
		System.out.println("Foram contabilizados " + votosNulos + " votos nulos");

		// Estrutura condicional para decidir quem ganhou ou se houve empate
		if (votosCandidato1 > votosCandidato2) {
			System.out.println(candidato1 + " foi vitorioso");
		} else if (votosCandidato2 > votosCandidato1) {
			System.out.println(candidato2 + " foi vitorioso");
		} else {
			System.out.println("Empate!!");
		}
	}
}
