//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main (String[] args) {
		String frase = "";
		int contador = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");
		frase = entrada.nextLine();
		
		entrada.close();
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.toLowerCase().charAt(i) == 'a') {
				contador++;
			}
		}
		
		System.out.print("Caracter \'a\' apareceu: " + contador);
	}
}

