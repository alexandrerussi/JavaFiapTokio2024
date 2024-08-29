package logica.exercicios.aula05;

public class Exercicio02 {

	public static void main(String[] args) {

		int numInt = 2;
		float numFloat = 2.5f;
		double numDouble = 5.0;
		
		System.out.println(numInt + " " + numFloat + " " + numDouble);
		
		String numIntString = Integer.toString(numInt);
		String numFloatStr = Float.toString(numFloat);
		String numDoubleStr = Double.toString(numDouble);
		
		System.out.printf("%s %s %s", numIntString, numFloatStr, numDoubleStr);
		
		
	}

}
