//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main (String[] args) {
		String frase = "";
		int contador = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");
		frase = entrada.nextLine().toUpperCase();
		
		entrada.close();
		
		for (char letra = 'A'; letra <= 'Z'; letra++) {
			contador = 0;
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) == letra) {
					contador++;
				}
			}
			
		System.out.println(letra + " - " + contador);
		}
		
		
	}
}

