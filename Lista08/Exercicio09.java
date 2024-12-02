//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		int[] vetorG = new int[5], vetorPares = new int[5];
		int contadorPares = 0;
		
		for (int i = 0; i < vetorG.length; i++) {
			System.out.print("Digite o " + (i+1) + " valor: ");
			vetorG[i] = entrada.nextInt();
			
				if (vetorG[i] % 2 == 0) {
					vetorPares[i] = vetorG[i];	
					contadorPares++;
				}
		}
		
		for (int i = 0; i < vetorPares.length; i++) {
			if (vetorPares[i] != 0) {
				System.out.print(vetorPares[i] + " ");	
			}
		}
		
		if (contadorPares == 0) {
			System.out.print("Nenhum elemento par foi digitado.");
		}
	}
}

