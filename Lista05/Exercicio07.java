//Escreva um programa em Java para ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main (String[] args) {
		int valor1, valor2;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Informe o primero valor: ");
		valor1 = entrada.nextInt();
		System.out.print("Informe o segundo valor: ");
		valor2 = entrada.nextInt();
		
		while (valor1 == valor2) {
			System.out.println("Os valores informados devem ser diferentes!");
			System.out.print("Informe novamente o primero valor: ");
			valor1 = entrada.nextInt();
			System.out.print("Informe novamente o segundo valor: ");
			valor2 = entrada.nextInt();
			entrada.close();
		}
		
		if (valor1 > valor2) { //10 e 2
			int auxiliar = valor1; //auxiliar = 10
			valor1 = valor2; //valor1 = 2
			valor2 = auxiliar; //valor2 = auxiliar = 10
		}
		System.out.printf("Ordem crescente: %d, %d.", valor1, valor2);
	}
}

