//Escreva um programa em Java para ler uma quantidade e a seguir ler esta quantidade de números. Depois de ler todos os números o algoritmo deve apresentar na tela o maior dos números lidos e a média dos números lidos.

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main (String[] args) {
		int quantidade, somador = 0, maior = 0, menor = 0, numero;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite a quantidade de numeros desejada: ");
		quantidade = entrada.nextInt();
		
		for (int i = 1; i <= quantidade; i++) {
			System.out.print("Digite um numero: ");
			numero = entrada.nextInt();
			somador += numero; //acumula o valor dos numeros digitados
			if (i == 1) {
				maior = numero;
				menor = numero;
			}
			if (numero > maior) {
				maior = numero;
			}
			if (numero < menor) {
				menor = numero;
			}
		}
		entrada.close();
		
		double media = somador / quantidade;
		
		System.out.printf("Maior numero lido: %d \nMedia dos numeros lidos: %.2f", maior, media);
	}
}

