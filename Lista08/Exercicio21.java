//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] AB = new int[10];
		
		for(int i = 0;i < 10;i++){
			System.out.print("Digite o elemento " + i + " do vetor AB: ");
			AB[i] = entrada.nextInt();
			if(AB[i] % 2 == 1){
				AB[i] *= 2;
			}
		}
		
		System.out.print("Os elementos do vetor AB, com os impares mulltiplicados por 2, e ");
		
		for(int i = 0;i < 10;i++){
			System.out.print(AB[i] + " ");
		}
	}
}
