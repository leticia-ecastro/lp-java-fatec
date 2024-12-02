//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio22 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = 0;
        do {
            System.out.print("Digite o tamanho do vetor: ");
            n = Vetor.scanner.nextInt();
            if (n < 1 && n > 20) {
                System.out.println("Entre com uma quantidade de termos no intervalo [1, 20]!");
            }
        } while (n < 1 || n > 20);
        System.out.print("Digite o valor máximo para os elementos do vetor: ");
        int valorMaximo = Vetor.scanner.nextInt();
        int[] ac = new int[n];
        for (int i = 0; i < ac.length; i++) {
            int valor;
            do {
                System.out.printf("[%d] = ", i);
                valor = Vetor.scanner.nextInt();
                if (valor > valorMaximo) {
                    System.out.printf("Digite um valor menor ou igual a %d!\n", valorMaximo);
                }
            } while (valor > valorMaximo);
            ac[i] = valor;
        }
        System.out.print("Vetor: ");
        Vetor.imprimirVetor(ac);
	}
}
