package logica.aulas.aula10;

import java.util.Scanner;

public class MetodosComArg {
	
	// FUNÇÃO COM PARAMETRO E SEM RETORNO PARA EXIBIR NOME PERSONALIZADO
	static void saudacaoComArgs(String nome) {
		System.out.println("Seja bem-vindo, " + nome);
	}
	
	// FUNÇÃO COM PARAMETRO E SEM RETORNO PARA EXIBIR UMA SOMA
	static void somar(int n1, int n2) {
		System.out.println("Soma: " + (n1 + n2));
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nomeDigitado = sc.nextLine();
		
		// CHAMANDO A FUNÇÃO saudacaoComArgs e PASSANDO COMO PARAMETRO A STRING
		saudacaoComArgs(nomeDigitado);
		
		// CHAMANDO FUNÇÃO DE SOMA
		somar(2, 3);
		
	}

}





