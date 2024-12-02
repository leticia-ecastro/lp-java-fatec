//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio55 {
	
	public static void main (String[] args) {
		int numero = 0, acumuladora = 0;
		Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = entrada.nextInt();
        entrada.close();
        
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                acumuladora += i;
            }
        }
        if (acumuladora == numero) {
            System.out.println("O número " + numero + " é um número perfeito.");
        } else {
            System.out.println("O número " + numero + " não é um número perfeito.");
        }
    }
}
