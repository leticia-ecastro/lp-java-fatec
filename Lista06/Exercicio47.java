/*
 * Imprima somente os números primos existentes na faixa de  1 até 100
 */

public class Exercicio47 {
	
	public static void main (String[] args) {
		int numero, divisores;
		
        for (int i = 1; i <= 100; i++) {
            numero = i;
            divisores = 0;
            for (int j = 1; j <= numero; j++) {
                if (numero % j == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }
}

