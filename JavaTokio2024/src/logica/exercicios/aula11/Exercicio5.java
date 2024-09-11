package logica.exercicios.aula11;

public class Exercicio5 {

	public static void main(String[] args) {
		
		/*
		Crie uma classe com um nome qualquer com o método main() padrão.
		Crie uma classe com o nome “OperacoesMatematicas” 
		sem método main por padrão.
		Crie essas duas classes no mesmo pacote.
		Na classe OperacoesMatematicas, crie um método que receba 
		como parâmetro a operação (+, -, *, /) e dois números. 
		
		Esse método deve chamar a função correspondente a sua operação 
		e retornar o resultado.
		
		Além disso, na classe OperacoesMatematicas, você deve criar os 
		métodos para cada operação. 
		Esses métodos não podem ser acessados fora da classe 
		OperacoesMatematicas
		
		Na classe com o método main(), chame o método da classe 
		OperacoesMatematicas passando como parâmetro a operação 
		desejada e dois números. Exiba o resultado.
		*/
		
		double resultado = OperacoesMatematicas.operacao('-', 4, 3);
		System.out.println(resultado);

		
	}

}
