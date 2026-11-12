import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escreva sua matrícula um funcionário : ");
		int matricula = input.nextInt();
		
		System.out.println("Informe seu nome : ");
		String nome = input.next();
		
		System.out.println("Informe quantas horas você trabalhou essa semana : ");
		double horasTrabalhadas = input.nextDouble();
		
		System.out.println("Quanto você recebe por hora trabalhada");
		double salarioHora = input.nextDouble();
		
		double salarioPorMes = (salarioHora * horasTrabalhadas) * 4;
		
		System.out.println("Seu numero de matricula é : " + matricula + " e seu nome é : " + nome + " e seu salario esse mês foi de : " + salarioPorMes + " Reais");
		
		input.close();

	}

}
