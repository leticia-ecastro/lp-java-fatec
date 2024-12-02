//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio30_v3 {
	
	public static void main (String[] args) {
		String frase = "", saida = "";
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Insira uma frase: ");
		frase = entrada.nextLine();
		
		entrada.close();
		
		for (int f = 0; f < frase.length(); f++) {
			if (frase.toLowerCase().charAt(f) >= 'a' && frase.toLowerCase().charAt(f) <= 'm'){
				saida += (char)(frase.charAt(f) + 13);
			} else {
				if (frase.toLowerCase().charAt(f) >= 'n' && frase.toLowerCase().charAt(f) <= 'z'){
				saida += (char)(frase.charAt(f) - 13);
				} else {
					saida += (char) (frase.charAt(f)); //copia o caractere de volta
				}
			}
		}
		
		System.out.print("Saida: " + saida);
		
	}
}

