package logica.aulas.aula09;

public class Atividade1 {

	public static void main(String[] args) {
		
		String nomes[] = {"Ana", "Bia", "Rodrigo", "Bruno"};
		
		// PT1.
		
		String nomeTemporario = nomes[0]; // Ana (fixei Ana)
		
		for (int i = 1; i < nomes.length; i++) {
			System.out.println(nomeTemporario + ", " + nomes[i]);
		}
		
	}

}
