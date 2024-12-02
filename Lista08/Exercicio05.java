//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe o tamanho do vetor (Tamanho maximo: 15): ");
		int tamanhoVetor = entrada.nextInt();
		
		do { //Faça enquanto o tamanho do vetor digitado pelo usuário for inválido!
			if (tamanhoVetor < 1 || tamanhoVetor > 15) {
			System.out.print("ERRO! Tamanho maximo do vetor: 15 \nInforme o tamanho do vetor: ");
			tamanhoVetor = entrada.nextInt();
			}
		} while (tamanhoVetor < 1 || tamanhoVetor > 15);
		
		int[] vetor1 = new int[tamanhoVetor], vetor2 = new int[tamanhoVetor], vetorSoma = new int[tamanhoVetor];
		//Cria os arrays vetor1, vetor2 e vetorSoma, todos com o tamanho informado pelo usuário (tamanhoVetor)
		
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print("Informe o " + (i+1) + " valor do vetor 1: ");
			vetor1[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < vetor2.length; i++) {
			System.out.print("Informe o " + (i+1) + " valor do vetor 2: ");
			vetor2[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < vetorSoma.length; i++) {
			vetorSoma[i] = vetor1[i] + vetor2[i];
			System.out.print(vetorSoma[i] + " ");
		}
		
		
		
		
		
	}
}

