/*
 * Escreva um programa em Java que imprima sequência 5:
 * 1, 1 3 5 7 9
 * 2, 2 4 6 8 10
 * 3, 1 3 5 7 9
 * 4, 2 4 6 8 10
 * 5, 1 3 5 7 9
 * 6, 2 4 6 8 10
 * 7, 1 3 5 7 9
 * 8, 2 4 6 8 10
 * 9, 1 3 5 7 9
 * 10, 2 4 6 8 10
 */

public class Exercicio29 {
	
	public static void main (String[] args) {
		for (int y = 1; y <= 10; y++) {
			System.out.print(y + ", ");
			if (y % 2 == 0) {
				for (int x = 2; x <= 10; x += 2) {
					System.out.print(x + " ");
				}
			} else {
				for (int x = 1; x <= 10; x += 2) {
					System.out.print(x + " ");
				}
			}
		System.out.println();
		}
	}
}

