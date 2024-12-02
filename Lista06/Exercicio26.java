/*
 * Escreva um programa em Java que imprima sequência 2:
 * 1, 1
 * 2, 1 2
 * 3, 1 2 3
 * 4, 1 2 3 4
 * 5, 1 2 3 4 5
 * 6, 1 2 3 4 5 6
 * 7, 1 2 3 4 5 6 7
 * 8, 1 2 3 4 5 6 7 8
 * 9, 1 2 3 4 5 6 7 8 9
 * 10, 1 2 3 4 5 6 7 8 9 10
 */

public class Exercicio26 {
	
	public static void main (String[] args) {
		for (int coluna = 1; coluna <= 10; coluna++) {
			System.out.print(coluna + ", ");
			for (int linha = 1; linha <= coluna; linha++) {
				System.out.print(linha + " ");
			}
			System.out.println();
		}
	}
}

