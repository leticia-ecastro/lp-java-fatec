//Escreva um programa em Java para ler 2 valores, calcular e escrever a soma dos inteiros existentes entre os 2 valores lidos (incluindo os valores lidos na soma). Considere que o segundo valor lido será sempre maior que o primeiro valor lido.

import java.util.Scanner;

public class Exercicio14 {
	
	public static void main (String[] args) {
		int numero1, numero2, intervalo = 0;
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o primeiro numero: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite o segundo numero: ");
		numero2 = entrada.nextInt();
		entrada.close();
		
		for (int i = numero1; i <= numero2; i++) {
			intervalo += i;
		}
		
		System.out.print("A soma dos numeros inteiros compreendidos no intervalo de [" + numero1 + "," + numero2 + "] é igual a " + intervalo + ".");
	}
}

