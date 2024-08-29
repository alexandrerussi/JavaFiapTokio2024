package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota A: ");
		double notaA = sc.nextDouble();
		
		System.out.println("Digite a nota B: ");
		double notaB = sc.nextDouble();
		
		double media = (notaA + notaB) / 2;
		
		System.out.println("Media: " + media);

	}

}
