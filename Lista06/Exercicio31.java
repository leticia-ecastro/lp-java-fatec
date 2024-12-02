//Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja positivo imprimir a sequência de termos: 1, 2, 3, 4, ...

import java.util.Scanner;

public class Exercicio31 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
        int quantidadeTermos = 0;
        
        do {
            System.out.print("Informe a quantidade de termos da sequência: ");
            quantidadeTermos = entrada.nextInt();
            if (quantidadeTermos == 0) {
                break;
            }
            if (quantidadeTermos < 0) {
                System.out.println("ERRO! Digite uma quantidade positiva!");
            }
        } while (quantidadeTermos < 0);
        
        entrada.close();
        
        for (int i = 1; i <= quantidadeTermos; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

