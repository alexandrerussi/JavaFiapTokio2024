package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salario atual: ");
		double salarioAtual = sc.nextDouble();
		
		double reajuste;
		
		if (salarioAtual <= 280) {
			reajuste = 0.2; // 20%
		} else if (salarioAtual > 280 && salarioAtual <= 700) {
			reajuste = 0.15; // 15%
		} else if (salarioAtual > 700 && salarioAtual <= 1500) {
			reajuste = 0.10; // 10%
		} else {
			reajuste = 0.05; // 5%
		}
		
		double valorAumento = salarioAtual * reajuste;
		
		double novoSalario = salarioAtual + valorAumento;
		
		System.out.println("Salario antes do reajuste: " + salarioAtual);
		System.out.println("Percentual do aumento: " + reajuste*100 + "%");
		System.out.println("Valor do aumento: " + valorAumento);
		System.out.println("Novo salario com aumento: " + novoSalario);
		
	}

}







