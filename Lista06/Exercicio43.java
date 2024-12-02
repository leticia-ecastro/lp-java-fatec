//Solicite ao usuário 7 números inteiros e para cada leitura informar o fatorial desse número.

import java.util.Scanner;

public class Exercicio43 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
        int contador = 1;
        
        while (contador <= 7) {
            System.out.print("Digite um número: ");
            int numero = entrada.nextInt();
            int fatorial = 1;
            if (numero != 0) {
                for (int i = 1; i <= numero; i++) {
                    fatorial *= i;
                }
            }
            System.out.printf("%d! = %d\n", numero, fatorial);
            contador++;
        }
        entrada.close();
	}
}

