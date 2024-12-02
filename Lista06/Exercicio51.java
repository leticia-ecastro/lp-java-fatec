//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio51 {
	
	public static void main (String[] args) {
		int quantidadeTermos = 0, anterior = 0, proximo = 1, fibonacci; 
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite a quantidade de termos da sequência: ");
        quantidadeTermos = entrada.nextInt();
        
        entrada.close();
        
        for (int i = 1; i <= quantidadeTermos; i++) {
            System.out.print(anterior + " ");
            fibonacci = anterior + proximo;
            anterior = proximo;
            proximo = fibonacci;
        }
        
        System.out.println();
	}
}


