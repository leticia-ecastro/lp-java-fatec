//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite uma frase: ");
		String frase = entrada.nextLine();
		entrada.close();
		String[] palavras = frase.split(" ");
		
		for (String palavra : palavras)
		{
			System.out.println(palavra);
		}
		
	}
}

