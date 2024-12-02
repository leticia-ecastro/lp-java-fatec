//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio14 {
	
	public static void main (String[] args) {
		String frase = "", saida = "";
		char letra;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");;
		frase = entrada.nextLine().toLowerCase();
		
		System.out.print("Escolha uma letra: ");
		letra = entrada.nextLine().toLowerCase().charAt(0);
		
		entrada.close();
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == letra) {
				saida += '*'; //saida = saida + '+'
			} else {
				saida += frase.charAt(i); //saida = saida + fase.charAt(i)
			}
		}
		
		System.out.print("Saida: " + saida);
		
	}
}

