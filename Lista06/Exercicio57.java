//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio57 {
	
	public static void main (String[] args) {
		int quantidadeTermos = 0, contadorTermos = 0, numero, acumuladora;
		Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequência: ");
        quantidadeTermos = entrada.nextInt();
        
        entrada.close();
        
        for (int i = 1; contadorTermos != quantidadeTermos; i++) {
            numero = i;
            acumuladora = 0;
            for (int j = 1; j < numero; j++) {
                if (numero % j == 0) {
                    acumuladora += j;
                }
            }
            if (acumuladora == numero) {
                System.out.print(numero + " ");
                contadorTermos++;
            }
        }
        System.out.println();
    }
}
