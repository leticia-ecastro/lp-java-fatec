//Solicite ao usuário a quantidade de termos da sequência de números primos e imprima a sequência do final para o início.

import java.util.Scanner;

public class Exercicio49 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		int quantidadeTermos = 0, numero, divisores, contadorTermos = 0;
		
		System.out.print("Digite a quantidade de termos da sequência: ");
		quantidadeTermos = entrada.nextInt();
		
        entrada.close();
        
        StringBuilder sequencia = new StringBuilder();
        for (int i = 1; contadorTermos != quantidadeTermos; i++) {
            numero = i;
            divisores = 0;
            for (int j = 1; j <= numero; j++) {
                if (numero % j == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                sequencia.append(numero + " ");
                contadorTermos++;
            }
        }
        System.out.println("Sequência inversa:" + sequencia.reverse());
	}
}
