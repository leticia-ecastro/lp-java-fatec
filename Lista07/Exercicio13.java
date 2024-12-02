//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio13 {
	
	public static void main (String[] args) {
		/* Para gerar o alfabeto:
		String alfabeto = "";
		for (char letra = 'a'; letra <= 'z'; letra++) {
			alfabeto += letra;
		}
		
		System.out.print(alfabeto); //abcdefghijklmnopqrstuvwxyz
		*/
		
		String frase = "";
		String consoantes = "bcdfghjklmnpqrstvwxyz";
		int contadorConsoantes = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");
		frase = entrada.nextLine().toLowerCase();
		
		entrada.close();
		
		for (int c = 0; c < consoantes.length(); c++) {
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) == consoantes.charAt(c)) {
					contadorConsoantes++;
				}
			}	
		}
		
		System.out.print("Quantidade de consoantes: " + contadorConsoantes);
	}
}

