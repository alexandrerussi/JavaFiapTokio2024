package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		/*
		Escreva um algoritmo que recebe dois números e um caractere 
		(representando uma das operações matemáticas (+, -, *, /)
		 
		O programa deve calcular o valor final de acordo com a 
		operação selecionada.
		
		Ou seja, se a entrada for 5, 6 e *, então seu programa 
		deve mostrar 30.

		Dica: switch/case facilita as coisas.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro num: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Digite o segundo num: ");
		double n2 = sc.nextDouble();
		
		System.out.println("Digite o caracter da operacao [+, -, *, /]: ");
		char operacao = sc.next().charAt(0);
		
		System.out.println("Primeiro num: " + n1);
		System.out.println("Segundo num: " + n2);
		System.out.println("Operacao selecionada foi: " + operacao);
		
		double resultado = 0;
		
		switch(operacao) {
			case '+':
				resultado = n1 + n2;
				System.out.println("Resultado: " + resultado);
				break;
			case '-':
				resultado = n1 - n2;
				System.out.println("Resultado: " + resultado);
				break;
			case '*':
				resultado = n1 * n2;
				System.out.println("Resultado: " + resultado);
				break;
			case '/':
				if (n2 != 0) {
					resultado = n1 / n2;
					System.out.println("Resultado: " + resultado);
				} else {
					System.out.println("Nao e possivel dividir por 0");
				}
				break;
			default:
				System.out.println("Operacao invalida");
		}

		
	}

}






