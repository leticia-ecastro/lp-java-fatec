//Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja positivo imprimir a sequência de termos: 0, 2, 4, 6, ...

import java.util.Scanner;

public class Exercicio32 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
        int quantidadeTermos = 0;
        
        do {
            System.out.print("Digite a quantidade de termos da sequência: ");
            quantidadeTermos = entrada.nextInt();
            if (quantidadeTermos == 0) {
                break;
            }
            if (quantidadeTermos < 0) {
                System.out.println("ERRO! Digite uma quantidade positiva: ");
            }
        } while (quantidadeTermos < 0);
        
        entrada.close();
        
        for (int i = 0; i <= quantidadeTermos - 1; i++) {
            System.out.print((i * 2) + " ");
        }
        
        System.out.println();
	}
}

