/*
 * Escreva um programa em Java que imprima sequência 3:
 * 1, 1 2 3 4 5 6 7 8 9 10
 * 2, 1 2 3 4 5 6 7 8 9
 * 3, 1 2 3 4 5 6 7 8
 * 4, 1 2 3 4 5 6 7
 * 5, 1 2 3 4 5 6
 * 6, 1 2 3 4 5
 * 7, 1 2 3 4
 * 8, 1 2 3
 * 9, 1 2
 * 10, 1
 */

public class Exercicio27 {
	
	public static void main (String[] args) {
		int auxiliar = 10; 
		for (int y = 1; y <= 10; y++) {
			System.out.print(y + ", ");
			for (int x = 1; x <= auxiliar; x++) {
				System.out.print(x + " ");
			}
			auxiliar--;
			System.out.println();
		}
	}
}

