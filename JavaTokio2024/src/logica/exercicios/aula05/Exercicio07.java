package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		/*
		Crie um programa que receba o valor do produto e valor pago.
		Calcule o troco a ser pago. 
		O valor do troco deve ser exibido no terminal.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		double valorProduto = sc.nextDouble();
		
		System.out.println("Digite o valor a ser pago: ");
		double valorPago = sc.nextDouble();
		
		double troco = valorPago - valorProduto;
		
		System.out.println("O troco é de: " + troco);

	}

}
