//Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja positivo imprimir a sequência de termos: 1/50 + 2/49, 3/48 + ... + 50/1. Exemplo com entrada de 50 termos. Apresentar a soma desta sequência no final.

import java.util.Scanner;

public class Exercicio39 {
	
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
                System.out.println("Digite uma quantidade positiva!");
            }
        } while (quantidadeTermos < 0);
        
        entrada.close();
        
        int numerador = 1, denominador = quantidadeTermos;
        double somaSequencia = 0;
        
        for (int i = 1; i <= quantidadeTermos; i++) {
            System.out.print(numerador + "/" + denominador + " ");
            somaSequencia += (double) numerador / denominador;
            numerador++;
            denominador--;
        }
        
        System.out.println("\nSoma da sequência: " +  somaSequencia);
	}
}

