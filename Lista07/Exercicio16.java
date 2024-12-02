//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio16 {
	
	public static void main (String[] args) {
		String frase = "";
		int contadorMaiusculo = 0;
		int contadorEspacos = 0;
		boolean tudoMaiusculo = false;
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite uma frase: ");
		frase = entrada.nextLine();
		
		entrada.close();
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
				contadorMaiusculo++;
			} else if (frase.charAt(i) == ' ') {
				contadorEspacos++;
			}
		}
		
		if (contadorMaiusculo == (frase.length() - contadorEspacos)) {
			tudoMaiusculo = true;
		}
		
		System.out.print("Todos os caracteres alfabeticos digitados na frase sao maiusculos? " + (tudoMaiusculo ? "Sim" : "Nao"));
	}
}

