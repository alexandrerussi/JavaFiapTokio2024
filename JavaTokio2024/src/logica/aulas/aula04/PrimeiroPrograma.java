package logica.aulas.aula04;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		System.out.println("Olá Mundo!");
		
		int idade;
		idade = 25;		
		System.out.println(idade);

		idade = 42;
		System.out.println(idade);
		
		double salario = 1530.24;
		System.out.println(salario);
		
		String nome = "Maria";
		System.out.println(nome);
		
		System.out.println("Bem-vindo(a), " + nome + "!");
		System.out.println(nome + ", você tem " + (idade+idade) + " anos.");
		
		System.out.printf("Bem-vido(a), %S!\n", nome);
		System.out.printf("%s, você tem %d anos.", nome, idade);
		
	}

}
