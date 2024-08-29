package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota A: ");
		double notaA = sc.nextDouble();
		
		System.out.println("Digite a nota B: ");
		double notaB = sc.nextDouble();
		
		double mediaPonderada = (notaA * 0.4) + (notaB * 0.6);
		
		System.out.println("Media ponderada: " + mediaPonderada);
		
	}

}
