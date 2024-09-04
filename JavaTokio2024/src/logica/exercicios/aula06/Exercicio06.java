package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		/*
		Faça um programa que receba o ano de nascimento da 
		pessoa e retorne:
		Se o voto é obrigatório este ano;
		Se o voto é opcional este ano;
		Se o voto é proibido este ano.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu ano de nasc: ");
		int anoNascimento = sc.nextInt();
		
		int idade = 2024 - anoNascimento;
		
		if (idade < 16) {
			System.out.println("Voto proibido");
		} else if ((idade >= 16 && idade < 18) || idade > 70) {
			System.out.println("Voto opcional");
		} else {
			System.out.println("Voto obrigatorio");
		}

		
	}

}
