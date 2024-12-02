//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int tamanhoVetor = entrada.nextInt();
		
		do { //faça enquanto o valor do vetor for inválido
			if (tamanhoVetor < 1 || tamanhoVetor > 20) {
			System.out.print("ERRO! O vetor deve ter tamanho entre 1 e 20. \nInforme o tamanho do vetor: ");
			tamanhoVetor = entrada.nextInt();
			}
		} while (tamanhoVetor < 1 || tamanhoVetor > 20);
		
		int[] vetorD = new int[tamanhoVetor];
		//Crio o array "vetor", cujo tamanho é o "tamanhoVetor"
		
		for (int i = 0; i < vetorD.length; i++) {
			System.out.print("Insira o " + (i + 1) + " valor: ");
			vetorD[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < vetorD.length; i++) {
			System.out.print(vetorD[i] + " ");
		}
	}
}

