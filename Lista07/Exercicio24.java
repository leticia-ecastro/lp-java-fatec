//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio24 {
	
	public static void main (String[] args) {
		String sequencia = "";
		int contador = 0, maiorSequenciaConsecutiva = 0;
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite a sequencia: ");
		sequencia = entrada.nextLine();
		
		for (int i = 0; i < sequencia.length(); i++) {
			if (sequencia.charAt(i) == '1') {
				contador++;
			} else {
				contador = 0;
			}
			if (contador > maiorSequenciaConsecutiva) {
				maiorSequenciaConsecutiva = contador;
			}
		}
		System.out.print("A maior sequencia de numeros 1 digitada foi : " + maiorSequenciaConsecutiva);
		
	}
}

