//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio22 {
	
	public static void main (String[] args) {
		String frase = "", palavra = "";
		int contador = 0;
		
		Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        frase = entrada.nextLine().toLowerCase();
        System.out.print("Digite uma palavra: ");
        palavra = entrada.nextLine().toLowerCase();
        entrada.close();
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i).startsWith(palavra)) { //Se a parte da frase que começa na posição/índice i começar com a palavra digitada
                contador++;
            }
        }
        System.out.println("A palavra \'" + palavra + "\' ocorre " + contador + " vezes na frase digitada.");
	}
}

