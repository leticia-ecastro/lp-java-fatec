//Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja positivo imprimir a sequência de termos: 1, 3, 5, 7, ...

import java.util.Scanner;

public class Exercicio33 {
	
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
                System.out.println("ERRO! Digite uma quantidade positiva!");
            }
        } while (quantidadeTermos < 0);
        
        entrada.close();
        
        int auxiliar = 1;
        for (int i = 1; i <= quantidadeTermos; i++) {
            if (i == 1) {
                System.out.print(auxiliar + " ");
            } else {
                System.out.print(auxiliar + " ");
            }
            auxiliar += 2;
        }
        System.out.println();
	}
}

