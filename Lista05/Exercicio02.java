//Escreva um programa em Java para ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main (String[] args) {
		int numero;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite um numero: ");
		numero = entrada.nextInt();
		entrada.close();
		if (numero < 0) {
			System.out.println("O numero digitado é negativo.");
		} else {
			System.out.println("O numero digitado é positivo");
		}
	}
}

