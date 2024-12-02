//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main (String[] args) {
		String frase = "";
		int contadorNumero = 0;
		int contadorLetra = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");
		frase = entrada.nextLine().toUpperCase();
		
		entrada.close();
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
				contadorLetra++;
			}
			
			if (frase.charAt(i) >= '0' && frase.charAt(i) <= '9') {
				contadorNumero++;
			}
		}
		System.out.println("Quantidade de letras: " + contadorLetra);
		System.out.print("Quantidade de numeros: " + contadorNumero);
		
	}
}

