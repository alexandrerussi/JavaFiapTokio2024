package logica.aulas.aula05;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		// LOGICA E (&&)
		// EMAIL	SENHA	LOGIN
		// true		true	true
		// true		false	false
		// false	true	false
		// false	false	false
		
		boolean verificaEmail = false;
		boolean verificaSenha = false;
		
		boolean logicaE = verificaEmail && verificaSenha;
		System.out.println(logicaE);
		
		// LOGICA OU (||)
		// SOL NO DOM	JOGO BR		CHURRASCO NO DOM.
		// true			true		true
		// true			false		true
		// false		true		true
		// false		false		false
		
		boolean logicaOU = false || false;
		System.out.println(logicaOU);
		
		// OPERADOR DE NEGAÇÃO
		
		boolean negacao = !false;
		System.out.println(negacao);
		
	}

}




