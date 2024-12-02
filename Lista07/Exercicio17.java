//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main (String[] args) {
		String frase1 = "";
		String frase2 = "";
		boolean frasesIguais = false;
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite a primeira frase: ");
		frase1 = entrada.nextLine();
		System.out.print("Digite a segunda frase: ");
		frase2 = entrada.nextLine();
		
		entrada.close();
		
		for (int i = 0; i < frase1.length(); i++) {
			if (frase1.charAt(i) != frase2.charAt(i)) {
				frasesIguais = false;
				break;
			}
		}
		System.out.print("As frases digitadas sao iguais? " + (frasesIguais ? "Sim" : "Nao"));
	}
}

