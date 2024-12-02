//Escreva um programa em Java para ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS.

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main (String[] args) {
		int contadorNegativo = 0;
		Scanner entrada = new Scanner (System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.print("Insira o " + i + "º" + "numero: ");
			int numero = entrada.nextInt();
			if (numero < 0) {
			contadorNegativo++;
			}
		}
		
		entrada.close();
		
		System.out.println("Quantidade de numeros negativos digitados pelo usuario: " + contadorNegativo);
	}
}
