//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio23 {
	
	public static void main (String[] args) {
		String nomeCompleto = "";
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite o nome completo: ");
		nomeCompleto = entrada.nextLine();
		
		entrada.close();
		
		String[] nomes = nomeCompleto.split(" ");
		
		System.out.printf("Sobrenome: %s", nomes[nomes.length - 1]);
	}
}

