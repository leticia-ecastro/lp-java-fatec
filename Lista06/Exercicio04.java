//Escreva um programa em Java para ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere que o N será sempre maior que ZERO.

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite um numero positivo: ");
		int n = entrada.nextInt();
		
		while (n <= 0) {
			System.out.print("ATENCAO: Informe um numero maior que zero: ");
			n = entrada.nextInt();
			}
		
		entrada.close();
		
		System.out.println("Valores entre 1 e " + n + ":");
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
}

