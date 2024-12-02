//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio27 {
	
	public static void main (String[] args) {
		String string1 = "";
		String string2 = "";
		boolean mesmoTamanho = false;
		
		Scanner entrada = new Scanner (System.in);
		
		do {
			System.out.print("Digite uma palavra: ");
			string1 = entrada.nextLine();
			System.out.print("Digite outra palavra: ");
			string2 = entrada.nextLine();
			
			if (string1.length() == string2.length()) {
				mesmoTamanho = true;
			} else {
				System.out.println("Atencao! Digite duas palavras de mesmo tamanho!");
			}
		} while (!mesmoTamanho); //while (true)
		
		
		
		StringBuilder stringsConcatenadas = new StringBuilder(); //Cria a classe StringBuilder para poder concatenar strings de forma segura
		for (int i = 0; i < string1.length(); i++)
		{
			stringsConcatenadas.append(string1.charAt(i)); //Método append: add caractere nas frases concatenadas
			stringsConcatenadas.append(string2.charAt(i));
		}
		 
		System.out.print("Frase concatenada: " + stringsConcatenadas);
	}
}

