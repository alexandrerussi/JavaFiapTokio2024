package logica.aulas.aula06;

public class Condicionais {

	public static void main(String[] args) {
		
		// ------------------------------
		// ESTRUTURA CONDICIONAL SIMPLES
		// ------------------------------
		
		/*
		float nota = 7;
		
		if (nota < 7) {
			System.out.println("Sua nota e: " + nota);
		}
		
		System.out.println("FIM");
		*/
		
		
		// ------------------------------
		// ESTRUTURA CONDICIONAL COMPOSTA
		// ------------------------------
		
		/*
		float notaFinal = 5;
		
		if (notaFinal < 6) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado");
		}
		
		System.out.println("FIM");
		*/
		
		// ------------------------------
		// ESTRUTURA CONDICIONAL ENCADEADA
		// ------------------------------
		
		/*
		float notaFinal = 7;
		
		if (notaFinal < 4) {
			System.out.println("Reprovado");
		} else {
			System.out.println("VAMOS VER...");
			
			if (notaFinal < 6) {
				System.out.println("Recuperacao");
			} else { 
				System.out.println("Aprovado");
			}
		}
		*/
		
		// ------------------------------
		// ESTRUTURA CONDICIONAL COMPOSTA V2
		// ------------------------------
		
		float notaFinal = 2;
		
		if (notaFinal < 4) {
			System.out.println("Reprovado");
		} else if (notaFinal < 6) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Aprovado");
		}
		
	}

}








