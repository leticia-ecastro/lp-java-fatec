//Escreva um programa em Java para ler 10 números e ao final da leitura escrever a soma total dos 10 números lidos.

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main (String[] args) {
		int numero = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite um numero: ");
			numero += entrada.nextInt(); //numero = numero + entrada;
		}
		
		entrada.close();
		
		System.out.print("Soma total dos numeros digitados: " + numero);
	}
}

