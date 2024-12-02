//Solicite ao usuário o termo inicial e a quantidade de termos da sequência de números primos e imprima o resultado.

import java.util.Scanner;

public class Exercicio50 {
	
	public static void main (String[] args) {
		int termoInicial = 0, quantidadeTermos = 0, numero, divisores, contadorTermos = 0, contadorTermosAposPassagem = 0;;
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o termo inicial: ");
        termoInicial = entrada.nextInt();
        System.out.print("Digite a quantidade de termos da sequência: ");
        quantidadeTermos = entrada.nextInt();
        
        entrada.close();
        
        StringBuilder sequencia = new StringBuilder();
        for (int i = 1; contadorTermosAposPassagem != quantidadeTermos; i++) {
            numero = i;
            divisores = 0;
            for (int j = 1; j <= numero; j++) {
                if (numero % j == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                contadorTermos++;
                if (contadorTermos >= termoInicial) {
                    sequencia.append(numero + " ");
                    contadorTermosAposPassagem++;
                }
            }
        }
        System.out.println("Sequência: " + sequencia);
	}
}

