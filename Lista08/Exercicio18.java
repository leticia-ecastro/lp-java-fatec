//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio18 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n = 0;
		
		do {
			System.out.print("Digite a quantidade de elementos da sequencia de fatoriais: ");
			n = entrada.nextInt();
			if (n <= 0 || n > 15) {
				System.out.println("ERRO! A quantidade de elementos deve ser maior que 0 e menor que 15!");
			}
		} while (n <= 0 || n > 15);
		
		int[] fatoriais = new int[n]; 
		
		for (int f = 0; f < fatoriais.length; f++) {
			int numero = f + 1; 
			fatoriais[f] = 1;
			
			for (int i = 1; i <= numero; i++) {
				fatoriais[f] = fatoriais[f] * i; 
				//fatoriais[f] *= i
			}
			System.out.print(fatoriais[f] + " ");
		}
	}
}

