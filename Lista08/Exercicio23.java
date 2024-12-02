//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio23 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		int auxiliar = 0;
		int[] AD = new int[10];
		
		for(int i = 0;i < 10;i++){
			System.out.print("Digite o elemento " + i + " do vetor AD: ");
			AD[i] = entrada.nextInt();
		}
		
		for(int i = 0;i < 10;i++){
			for(int j = 0;j < 10;j++){
				if(AD[i] < AD[j] && AD[i] % 2 == 0 && AD[j] % 2 == 0){
					auxiliar = AD[j];
					AD[j] = AD[i];
					AD[i] = auxiliar;
				}
			}
		}
		
		System.out.print("Os elementos do vetor AD, com os valores pares em ordem crescente, e");
		
		for(int i = 0;i < 10;i++){
			System.out.print(" " + AD[i]);
		}
	}
}
