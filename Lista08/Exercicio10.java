//Letícia Elaine de Castro

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio10 {
	
	public static void main (String[] args) {
		int[] vetorPA = new int[5], vetorPB = new int[5], vetorPC = new int[10];
		Scanner entrada = new Scanner (System.in);
		
		for (int i = 0; i < vetorPA.length; i++) {
			System.out.print("Digite o " + (i+1) + " elemento do vetor PA: ");
			vetorPA[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < vetorPB.length; i++) {
			System.out.print("Digite o " + (i+1) + " elemento do vetor PB: ");
			vetorPB[i] = entrada.nextInt();
		}
		
		int auxiliar = 0;
		
		for (int i = 0; i < vetorPA.length; i++) {
			vetorPC[auxiliar++] = vetorPA[i];
		}
		
		for (int i = 0; i < vetorPB.length; i++) {
			vetorPC[auxiliar++] = vetorPB[i];
		}
		
		System.out.print(Arrays.toString(vetorPC));
	}
}


