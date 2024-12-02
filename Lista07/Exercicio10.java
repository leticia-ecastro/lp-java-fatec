//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main (String[] args) {
		String frase = " ";
		int contador = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");
		frase = entrada.nextLine();
		
		entrada.close();
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
				contador++;
			}
		}
		System.out.print("Quantidade de letras maiusculas: " + contador);
	}
}

