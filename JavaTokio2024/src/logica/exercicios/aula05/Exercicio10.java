package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		/*
		
		Leia 3 valores de entrada, referentes à idade de uma pessoa em: 
		anos, meses e dias. 
		Exemplo: eu tenho 30 anos, 2 meses e 7 dias.
		 
		Calcule e exiba o total de dias que essa pessoa já viveu. 
		
		Obs.: apenas para facilitar o cálculo, considere todo ano com 
		365 dias e todo mês com 30 dias.
	 	
	 	*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite qtos anos tu tens: ");
		int anos = sc.nextInt();
		
		System.out.println("Digite qtd de meses: ");
		int meses = sc.nextInt();
		
		System.out.println("Digite a qtd de dias: ");
		int dias = sc.nextInt();
		
		int qtdDias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Qtd de dias vividos: " + qtdDias);
		
		
	}

}
