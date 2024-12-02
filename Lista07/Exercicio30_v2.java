//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio30_v2 {
	
	public static void main (String[] args) {
		String frase = "", saida = "";
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Insira uma frase: ");
		frase = entrada.nextLine();
		
		entrada.close();
		
		for (int f = 0; f < frase.length(); f++) {
			if ((frase.charAt(f) >= 'a' && frase.charAt(f) <= 'm') || (frase.charAt(f) >= 'A' && frase.charAt(f) <= 'M')){
				saida += (char)(frase.charAt(f) + 13);
			} else {
				if ((frase.charAt(f) >= 'n' && frase.charAt(f) <= 'z') || (frase.charAt(f) >= 'N' && frase.charAt(f) <= 'Z')){
				saida += (char)(frase.charAt(f) - 13);
			} else {
				saida += (char) (frase.charAt(f)); //copia o caractere de volta
			}
			}
		}
		
		System.out.print("Saida: " + saida);
		
	}
}

