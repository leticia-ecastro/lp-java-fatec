//Letícia Elaine de Castro

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio24 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a quantidade de elementos: ");
        int quantidade  = entrada.nextInt();
        int[] vet = new int[quantidade];
		int impares = 0;

		for(int i = 0;i < quantidade;i++){
			System.out.print("Digite o elemento da posicao " + i + " do vetor: ");
			vet[i] = entrada.nextInt();

			if(vet[i] % 2 != 0){
				impares++;
			}
		}

		int[] vetImpares = new int[impares];
		int aux = 0;
		
		for(int i = 0;i < quantidade;i++){
			if(vet[i] % 2 != 0){
				vetImpares[aux] = vet[i];
				aux++;
			}
		}

		Arrays.sort(vetImpares);

		aux = vetImpares.length-1;

		for(int i = 0;i < quantidade;i++){
			if(vet[i] % 2 != 0){
				vet[i] = vetImpares[aux];
				aux--;
			}
		}

        System.out.print("Os elementos do vetor sao: ");

        for(int i = 0;i < quantidade;i++){
            System.out.print(vet[i] + " ");
        }
	}
}
