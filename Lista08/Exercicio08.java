//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		int[] vetorF = new int[5];
		int somaImpares = 0, contadorImpares = 0;
		
		for (int i = 0; i < vetorF.length; i++) {
			System.out.print("Digite o valor do " + (i+1) + " elemento: ");
			vetorF[i] = entrada.nextInt();
		
			if (vetorF[i] % 2 != 0) {
				somaImpares += vetorF[i];
				contadorImpares++;
			}
		}
		
		if (contadorImpares > 0) {
			System.out.print(somaImpares);
		} else {
			System.out.print("Nao ha elementos impares");
		}
	}	
}


