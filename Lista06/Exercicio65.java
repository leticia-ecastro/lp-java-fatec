//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio65 {
	
	public static void main (String[] args) {
		int quantidadeTermos, numerador = 0, denominador = 0;
        double somaSequencia = 0;
        // Fatoriais
        int fatorial = 1, contador = 1;
        // Primos
        int numero = 0, divisores = 0, auxiliar = 2;
        boolean encontrouValor = false; 
        
		Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequência: ");
        quantidadeTermos = entrada.nextInt();
        entrada.close();
        
        for (int i = 1; i <= quantidadeTermos; i++) {
            while (contador <= i) {
                fatorial *= i;
                contador++;
            }
            numerador = fatorial;
            encontrouValor = false;
            for (int j = auxiliar; !encontrouValor; j++) {
                numero = j;
                divisores = 0;
                for (int k = 1; k <= numero; k++) {
                    if (numero % k == 0) {
                        divisores++;
                        auxiliar = j + 1;
                    }
                }
                if (divisores == 2) {
                    denominador = numero;
                    encontrouValor = true;
                }
            }
            if (i % 2 != 0) {
                somaSequencia += (double) numerador / denominador;
                System.out.print(numerador + "/" + denominador + " ");
            } else {
                somaSequencia -= (double) numerador / denominador;
                System.out.print("-" + numerador + "/" + denominador + " ");
            }
        }
        System.out.printf("\nO valor final da sequência é %.3f\n", somaSequencia);
	}
}
