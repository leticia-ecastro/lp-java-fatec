//Letícia Elaine de Castro

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio07 {
	
	public static void main (String[] args) {
		int maior = 0, menor = 0;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite o tamanho do vetor (Tamanho maximo: 20): ");
		int tamanhoVetor = entrada.nextInt();
		
		do {
			if (tamanhoVetor < 1 || tamanhoVetor > 20) {
				System.out.print("ERRO! O tamanho do vetor deve ser menor ou igual a 20! \nInforme o tamanho do vetor: ");
				tamanhoVetor = entrada.nextInt();
			}
		} while (tamanhoVetor < 1 || tamanhoVetor > 20);
		
		int[] vetor = new int [tamanhoVetor];
		
		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.print("Informe o " + (i+1) + " valor: ");
			vetor[i] = entrada.nextInt();
		}
		
		Arrays.sort(vetor);
		maior = vetor[vetor.length - 1];
		menor = vetor[0];
		
		System.out.print("Maior: " + maior + " | Menor: " + menor);
		
	}
}

