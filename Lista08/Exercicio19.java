//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] Z = new int[10];
		int auxiliar = 0;
		
		for(int i = 0;i < 10;i++){
			System.out.print("Digite o elemento " + i + " do vetor Z: ");
			Z[i] = entrada.nextInt();
		}
		
		for(int i = 0;i < 10;i++){
			for(int j = 0;j < 10;j++){
				if(Z[i] < Z[j]){
					auxiliar = Z[j];
					Z[j] = Z[i];
					Z[i] = auxiliar;
				}
			}
		}
		
		System.out.print("Os elementos do vetor Z, em ordem crescente, sao:");
		
		for(int i = 0;i < 10;i++){
			System.out.print(" " + Z[i]);
		}
	}
}
