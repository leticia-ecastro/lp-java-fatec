//Escreva um programa em Java para ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido.

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main (String[] args) {
		int numero, tabuada;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite um numero entre 1 e 10: ");
		numero = entrada.nextInt();
		
		while (numero < 1 || numero > 10) {
			System.out.print("ATENCAO: Digite um numero no intervalo de 1 a 10: ");
			numero = entrada.nextInt();
		}
		
		System.out.println("Tabuada do " + numero + ":");
		for (int i = 0; i <= 10; i++) {
			tabuada = numero * i;
			System.out.println(numero + " x " + i + " = " + tabuada);
		}
	}
}
