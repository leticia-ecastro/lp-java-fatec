//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio28 {
	
	public static void main (String[] args) {
		String frase = "", fraseDobrada = "";
		int inicio = 0, fim = frase.length() - 1;
		Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        frase = entrada.nextLine();
        
        entrada.close();
        
        while (inicio < fim) {
            fraseDobrada += frase.charAt(inicio);
            inicio++;
            if (inicio <= fim) {
                fraseDobrada += frase.charAt(fim);
                fim--;
            }
        }
        System.out.println("Frase dobrada: " + fraseDobrada);
	}
}
