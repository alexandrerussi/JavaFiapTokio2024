package logica.aulas.aula10;

import java.util.Scanner;

public class Metodos {
	
	// METODOS SEM RETORNO E SEM PARAMETROS/ARGUMENTOS
	
	// DECLARAÇÃO DA FUNÇÃO
	static void saudacao() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Seja bem-vindo, " + nome);
	}

	public static void main(String[] args) {
		
		// CHAMADA DA FUNÇÃO
		saudacao();
		
		System.out.println();
		
	}

}
