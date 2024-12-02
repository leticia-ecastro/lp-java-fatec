//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main (String[] args) {
		int[] QA = new int[5], QB = new int[5], QC = new int[10];
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0;i < 5;i++){
			System.out.print("Digite o elemento da posicao " + i + " do vetor QA: ");
			QA[i] = entrada.nextInt();
			QC[i * 2] = QA[i];
		}
		for(int i = 0;i < 5;i++){
			System.out.print("Digite o elemento da posicao " + i + " do vetor QB: ");
			QB[i] = entrada.nextInt();
			QC[i * 2 + 1] = QB[i];
		}
		
		System.out.print("Os elementos do vetor QC sao:");
		
		for(int i = 0;i < 10;i++){
			System.out.print(" " + QC[i]);
		}
	}
}
