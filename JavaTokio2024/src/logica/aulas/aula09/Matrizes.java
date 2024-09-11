package logica.aulas.aula09;

public class Matrizes {

	public static void main(String[] args) {
	
		// TABULEIRO DO JOGO DA VELHA
		
		char[][] tabuleiro = new char[3][3];
		
		tabuleiro[0][0] = 'X';
		tabuleiro[1][1] = 'O';
		tabuleiro[2][2] = 'X';
		
		System.out.println();
		
		
		// CRIANDO MAIS ALGUMAS MATRIZES
		
		int[][] matriz = new int[4][5];
		
		int linhas = matriz.length; // quantidade de linhas
		System.out.println(linhas);
		
		int colunas = matriz[0].length; // quantidade de colunas que eu tenho na linha 0
		System.out.println(colunas);
		
		
//		matriz[0][0] = 1;
//		matriz[0][1] = 2;
//		matriz[0][2] = 3;
//		matriz[0][3] = 4;
//		matriz[0][4] = 5;
//		
//		matriz[1][0] = 6;
//		matriz[1][1] = 7;
//		matriz[1][2] = 8;
//		matriz[1][3] = 9;
//		matriz[1][4] = 10;
		
		int numero = 1;
		
		System.out.println();
		
		// FOR PARA INCLUIR VALORES NA MATRIZ
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = numero;
				numero++;
			}
		}
		
		
		// FOR PARA EXIBIR A MATRIZ
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}





