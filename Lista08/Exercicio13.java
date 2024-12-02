//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio13 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		int m = (int) (Math.random() * 10 + 1), n = (int) (Math.random() * 10 + 1);
        int[] p, q;
        p = Vetor.lerVetor(n);
        q = Vetor.lerVetor(m);
        System.out.print("Vetor 1: ");
        Vetor.imprimirVetor(p);
        System.out.print("Vetor 2: ");
        Vetor.imprimirVetor(q);
        int[] r = new int[m + n];
        r = Vetor.concatenarVetores(p, q);
        System.out.print("Vetor 3: ");
        Vetor.imprimirVetor(r);
	}
}
