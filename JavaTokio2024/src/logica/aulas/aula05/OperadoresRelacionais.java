package logica.aulas.aula05;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		System.out.println(6 == 3);
		
		int num1 = 40;
		
		System.out.println(num1 != 14); // (40 != 14) true
		System.out.println(num1 == 14); // (40 == 14) false
		
		System.out.println(false);
		
		boolean arLigado = false;
		
		boolean comparacao = num1 > 2;
		System.out.println("Comparacao: " + comparacao);
		
		String nome1 = "Joana";
		String nome2 = "Joana";
		
		System.out.println(nome1 == nome2);
		System.out.println(nome1.equals(nome2));
		
	}

}
