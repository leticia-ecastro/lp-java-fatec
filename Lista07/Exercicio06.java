//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main (String[] args) {
		String frase = "";
		char letra;
		int contador = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");
		frase = entrada.nextLine();
		
		System.out.print("Digite uma letra: ");
		letra = entrada.nextLine().toLowerCase().charAt(0);
		
		entrada.close();
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.toLowerCase().charAt(i) == letra) {
				contador++;
			}
		}
		
		System.out.print("Caracter \'" + letra + "\' apareceu: " + contador);
	}
}

