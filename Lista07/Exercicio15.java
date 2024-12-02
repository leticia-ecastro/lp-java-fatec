//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main (String[] args) {
		String frase = "";
		String numeros = "0123456789";
		Scanner entrada = new Scanner (System.in);
		int contador = 0;
		
		System.out.print("Digite uma frase: ");
		frase = entrada.nextLine();
		
		entrada.close();
		
		for (int n = 0; n < numeros.length(); n++) {
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) == numeros.charAt(n)) {
					contador++;
				}
			}	
		}
		
		if (contador > 0) {
			System.out.print("Existem caracteres numericos na frase digitada.");
		} else {
			System.out.print("NAO existem caracteres numericos na frase digitada.");
		}
	}
}

