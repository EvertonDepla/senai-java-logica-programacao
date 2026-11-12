import java.util.Scanner;
public class exercicioextra01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do primerio candidato : ");
		String candidato1 = input.next();
		System.out.println("Digite o nome do segundo candidato : ");
		String candidato2 = input.next();
		System.out.println("Digite o numero de eleitores : ");
		int votos = input.nextInt();
		String compara = "";
		
		int contacandidato1 = 0;
		int contacandidato2 = 0;
		int contaNulo = 0;
		
		int conta = 0;
		
		while(conta<votos) {
			System.out.println("Em qual candidato você vai votar : ");
			compara = input.next();
			
			if(compara.equalsIgnoreCase(candidato1)) {
				contacandidato1 = contacandidato1 + 1;
			}
			else if(compara.equalsIgnoreCase(candidato2)) {
				contacandidato2 = contacandidato2 + 1;
			}
			else {
				contaNulo = contaNulo + 1;
			}
			conta++;
			
			
		}
		System.out.println("votos no primerio candidato : " + contacandidato1);
		System.out.println("votos no segundo candidato : " +contacandidato2);
		System.out.println("votos nulos : " +contaNulo);

	}

}
