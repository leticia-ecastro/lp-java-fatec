/* Escreva um programa em Java para ler o código e o preço de 15 produtos, calcular e escrever:
* - o maior preço lido;
* - a média aritmética dos preços dos produtos.
*/

import java.util.Scanner;

public class Exercicio22 {
	
	public static void main (String[] args) {
		double preco, acumulador = 0, maior = 0, menor = 0, media = 0;
		Scanner entrada = new Scanner (System.in);
		
		for (int i = 1; i <= 15; i++) {
			System.out.print("Insira o preco do produto " + i + " : ");
			preco = entrada.nextDouble();
			acumulador += preco;
			if (i == 1) {
				maior = preco;
				menor = preco;
			}
			if (preco > maior) {
				maior = preco;
			}
			if (preco < menor) {
				menor = preco;
			}
		}
		entrada.close();
		
		media = acumulador / 15;
		
		System.out.printf("Maior preco lido: R$%.2f \nMedia aritmetica dos precos dos produtos: R$%.2f", maior, media);
	}
}
