package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		String nome = sc.nextLine();
		
		System.out.println("Selecione o seu genero da seguinte forma:");
		System.out.println("[M] - Masc");
		System.out.println("[F] - Fem");
		System.out.println("[O] - Outro");
		System.out.println("[N] - N responder");
		
		char genero = sc.nextLine().charAt(0);
		
		System.out.printf("Olá, %s! Voce escolheu a seguinte opcao de genero: %s", nome, genero);
		
	}

}
