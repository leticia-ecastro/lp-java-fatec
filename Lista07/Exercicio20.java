//Letícia Elaine de Castro

//Escreva um programa que receba uma frase, conte e imprima o número de palavras desta frase.

import java.util.Scanner;

public class Exercicio20 {
	
	public static void main (String[] args) {
		String frase = "";
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");
		frase = entrada.nextLine();
		
		entrada.close();
		
		String[] quantidadePalavras = frase.split(" ");
		//Método SPLIT: separa a frase em linhas cada vez que tiver um espaço digitado
		
		System.out.print("Quantidade de palavras digitadas: " + quantidadePalavras.length);
	}
}

