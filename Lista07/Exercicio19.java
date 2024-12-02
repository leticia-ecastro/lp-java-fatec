//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main (String[] args) {
		String palavra = "", palavraInvertida = "";
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite uma palavra: ");
		palavra = entrada.nextLine().toLowerCase();
		
		entrada.close();
		
		//Para pegar a última letra da palavra e colocar na primeira letra da palavraInvertida:
		for (int i = palavra.length()-1; i >= 0; i--) {
			palavraInvertida += palavra.charAt(i);
		}
		
		if (palavra.equals(palavraInvertida)) {
			System.out.print("A palavra \'" + palavra + "\' eh um palindromo!");
		} else {
			System.out.print("A palavra \'" + palavra + "\' NAO eh um palindromo!");
		}
	}
}

