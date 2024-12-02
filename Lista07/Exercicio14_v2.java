//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio14_v2 {
	
	public static void main (String[] args) {
		String frase = "", saida = "";
		char letra;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");;
		frase = entrada.nextLine().toLowerCase();
		
		System.out.print("Escolha uma letra: ");
		letra = entrada.nextLine().toLowerCase().charAt(0);
		
		entrada.close();
		
		frase = frase.replace(letra, '*'); //substitui a letra pelo *
		//e retorna uma string com a substituição da letra
		
		System.out.print("Saida: " + frase);
		
	}
}

