//Solicite ao usuário um número e mostre o fatorial do número informado.

import java.util.Scanner;

public class Exercicio41 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();
        entrada.close();
        
        int fatorial = 1;
        if (numero != 0) {
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
        }
        System.out.printf("%d! = %d\n", numero, fatorial);
	}
}

