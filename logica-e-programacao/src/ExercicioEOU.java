import java.util.Scanner;

public class ExercicioEOU {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite o dia da semana, tudo em minusculo : ");
		String diaSemana = input.next();
		
		if (diaSemana.equalsIgnoreCase("segunda") || diaSemana.equalsIgnoreCase("quarta")) {
			System.out.println("Aula de logica de programação");
		} else if(diaSemana.equalsIgnoreCase("terça")) {
			System.out.println("Aula de eletronica");
				} else if(diaSemana.equalsIgnoreCase("quinta") || diaSemana.equalsIgnoreCase("sexta")){
					System.out.println("Aula de Java");
			}
	}
}
