/*
 * Solicite ao usuário um número e verifique se este número é primo ou não.
 */

import java.util.Scanner;

public class Exercicio46 {
	
	public static void main (String[] args) {
		int numero, divisores = 0;
		Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = entrada.nextInt();
        entrada.close();
        
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            System.out.println("O número " + numero + " é primo!");
        } else {
            System.out.println("O número " + numero + " não é primo!");
        }
    }
}

