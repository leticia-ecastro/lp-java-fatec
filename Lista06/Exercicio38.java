//Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja positivo imprimir a sequência de termos: 0 (0/1), 1/2, 2/3, 3/4, 4/5, ...

import java.util.Scanner;

public class Exercicio38 {
	
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
                System.out.println("ERRO! Digite uma quantidade maior que zero!");
            }
        } while (quantidadeTermos < 0);
        
        entrada.close();
        
        int numerador = 0, denominador = 1;
        
        for (int i = 1; i <= quantidadeTermos; i++) {
            System.out.print(numerador + "/" + denominador + " ");
            numerador = denominador;
            denominador++;
        }
        
        System.out.println();
	}
}

