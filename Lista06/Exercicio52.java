//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio52 {
	
	public static void main (String[] args) {
		int termo = 0, anterior = 0, proximo = 1, fibonacci;
        boolean encontrou = false;
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite um termo da sequência: ");
        termo = entrada.nextInt();
        
        entrada.close();
        
        while (!encontrou && anterior <= termo) {
            System.out.print(anterior + " ");
            if (anterior == termo) {
                encontrou = true;
                break;
            }
            fibonacci = anterior + proximo;
            anterior = proximo;
            proximo = fibonacci;
        }
        System.out.println("\nO termo " + termo + " foi encontrado na sequência de Fibonacci? " + (encontrou ? "Sim" : "Não"));
    }
}
