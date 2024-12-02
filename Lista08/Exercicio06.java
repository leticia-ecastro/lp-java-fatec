//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe o tamanho dos vetores (Tamanho maximo: 15): ");
		int tamanhoVetores = entrada.nextInt();
		
		do{
			if (tamanhoVetores < 1 || tamanhoVetores > 15) {
			System.out.print("ERRO! O tamanho dos vetores deve estar entre 1 e 15. \nInforme o tamanho dos vetores: ");
			tamanhoVetores = entrada.nextInt();
			}
		} while (tamanhoVetores < 1 || tamanhoVetores > 15);
		
		int[] vetor1 = new int[tamanhoVetores], vetor2 = new int[tamanhoVetores];
		
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print("Informe o " + (i+1) + " elemento do vetor 1: ");
			vetor1[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < vetor2.length; i++) {
			System.out.print("Informe o " + (i+1) + " elemento do vetor 2: ");
			vetor2[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < vetor1.length; i++) {
			if (vetor1[i] == vetor2[i]) {
				System.out.print("Posicao " + i + ": Vetor 1 = " + vetor1[i] + " | Vetor 2 = " + vetor2[i] + "\nOs vetores na posicao " + i + " sao iguais.");
			}
		}
		
		System.out.print("\n\nFim do programa.");
		
	}
}

