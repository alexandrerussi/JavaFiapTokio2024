package logica.aulas.aula04;

import java.util.Scanner;

public class SegundoPrograma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Olá, " + nome);
		System.out.printf("Olá, %s\n", nome);
		
		System.out.println("Digite sua idade: ");
		System.out.println("Sua idade é: " + scanner.nextInt());
		
		scanner.close();
		

	}

}
