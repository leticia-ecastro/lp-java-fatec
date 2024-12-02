//Escreva um programa em Java que calcule e escreva a média aritmética dos números inteiros entre 15 (inclusive) e 100 (inclusive).

public class Exercicio16 {
	
	public static void main (String[] args) {
		int intervalo = 0, contador = 0;
		double media;
		
		for (int i = 15; i <= 100; i++) {
			intervalo += i;
			contador++;
		}
		
		media = intervalo / contador;
		
		System.out.printf("A media aritmetica dos numeros inteiros compreendidos entre 15 e 100 (inclusos) eh igual a %.0f.", media);
	}
}

