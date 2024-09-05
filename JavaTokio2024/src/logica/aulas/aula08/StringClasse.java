package logica.aulas.aula08;

public class StringClasse {

	public static void main(String[] args) {
		
		String str = "FIAP Paulista";
		
		int tamanhoStr = str.length();
		
		System.out.println(tamanhoStr);
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(5));
		
		System.out.println("--------");
		
		for (int i = 0; i < tamanhoStr; i++) {
			System.out.println(str.charAt(i));
		}
	}

}









