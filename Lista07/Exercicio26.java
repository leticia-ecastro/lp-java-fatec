//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio26 {
	
	public static void main (String[] args) {
		StringBuilder sequencia = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            sequencia.append((char) ('a' + Math.random() * 26));
        }
        System.out.println("Sequencia gerada: " + sequencia.toString());
        int contador = 0;
        System.out.print("Letras não encontradas na sequência: ");
       
       //terminar esse exercicio
	}
}

