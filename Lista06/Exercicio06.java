//Escreva um programa em Java que calcule e imprima a tabuada do 8 (1 a 10).

public class Exercicio06 {
	
	public static void main (String[] args) {
		int tabuada;
		System.out.println("Tabuada do 8:");
		for (int i = 0; i <= 10; i++) {
			tabuada = 8 * i;
			System.out.println("8 x " + i + " = " + tabuada);
		}
	}
}

