package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em reais");
		double reais = sc.nextDouble();
		
		System.out.println("Valor em real: " + reais);
		
		double dolarAmericano = reais / 5.64;
		double dolarAmericano2 = reais * 0.18;
		System.out.println("Valor em dolar: " + dolarAmericano);
		System.out.println("Valor em dolar2: " + dolarAmericano2);

	}

}
