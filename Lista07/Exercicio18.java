//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio18 {
	
	public static void main (String[] args) {
		String caracteres = "";
		boolean sequenciaBinaria = false;
		int contador = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Insira uma sequencia de caracteres: ");
		caracteres = entrada.nextLine();
		
		entrada.close();
		
		for (int i = 0; i < caracteres.length(); i++) {
			if (caracteres.charAt(i) == '0' || caracteres.charAt(i) == '1') {
				contador++;
			}
		}
		
		if (contador == 8 && caracteres.length() == 8) {
			sequenciaBinaria = true;
		}
		
		System.out.print("Os caracteres digitados representam uma sequencia binaria? " + (sequenciaBinaria ? "Sim" : "Nao"));
	}
}

