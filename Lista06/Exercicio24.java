//Escreva um programa em Java que imprima a tabuada do 1 ao 10, para os números de 0 a 10.

public class Exercicio24 {
	
	public static void main (String[] args) {
		
		for (int a = 0; a <= 10; a++) {
			System.out.println("Tabuada do numero " + a);
			for (int b = 1; b <= 10; b++) {
				System.out.printf("%d x %d = %d\n", a, b, a * b);
			}
		}
	}
}

