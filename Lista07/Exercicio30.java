//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio30 {
	
	public static void main (String[] args) {
		String frase = "", saida = "";
		String zenit = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String polar = "nopqrstuvwxyzabcdefghijklmNOPQRSTUVWXYZABCDEFGHIJKLM";
		
		boolean achei = false;
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Insira uma frase: ");
		frase = entrada.nextLine();
		
		entrada.close();
		
		for (int f = 0; f < frase.length(); f++) {
			achei = false;
			for (int z = 0; z < zenit.length(); z++) {
				if (frase.charAt(f) == zenit.charAt(z)) {
					saida += polar.charAt(z);
					achei = true;
				} 
			}
			
			if (!achei) {
				saida += frase.charAt(f);
			}
		}
		System.out.print("Saida: " + saida);
		
	}
}

