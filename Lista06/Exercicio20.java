//Escreva um programa em Java que leia 100 valores e no final, escreva o maior e o menor valor lido.

public class Exercicio20 {
	
	public static void main (String[] args) {
		int numero, maior = 0, menor = 0;
		for (int contador = 1; contador <= 100; contador++) {
			numero = (int) (Math.random() * 100) + 1;
			if (contador == 1) {
				maior = numero;
				menor = numero;
			}
			if (numero > maior){
				maior = numero;
			}
			if (numero < menor) {
				menor = numero;
			}
		}
		
		System.out.printf("Maior valor: %d | Menor valor: %d", maior, menor);
	}
}

