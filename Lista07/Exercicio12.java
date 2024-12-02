//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main (String[] args) {
		String frase = "";
		String vogais = "aeiou";
		int contadorVogais = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");
		frase = entrada.nextLine().toLowerCase();
		
		entrada.close();
		
		for (int v = 0; v < vogais.length(); v++) { //VOGAIS
			for (int i = 0; i < frase.length(); i++) { //CARACTERES DA FRASE
				if (frase.charAt(i) == vogais.charAt(v)) {
					contadorVogais++;
				}
			}
		}
		System.out.print("Quantidade de vogais: " + contadorVogais);
	}
}

