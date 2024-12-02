/*
 * Escreva um programa em Java que imprima sequência 4:
 * 1, 2 3 4 5 6 7 8 9 10
 * 2, 3 4 5 6 7 8 9 10
 * 3, 4 5 6 7 8 9 10
 * 4, 5 6 7 8 9 10
 * 5, 6 7 8 9 10
 * 6, 7 8 9 10
 * 7, 8 9 10
 * 8, 9 10
 * 9, 10
 * 10,
 */

public class Exercicio28 {
	
	public static void main (String[] args) {
		int auxiliar = 1;
		for (int a = 1; a <= 10; a++) {
			System.out.print(a + ", ");
			for (int b = auxiliar + 1; b <= 10; b++) {
				System.out.print(b + " ");
			}
			auxiliar++;
			System.out.println();
		}	
	}
}

