//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio59 {
	
	public static void main (String[] args) {
		int anterior, proximo, quantidadeTermos, ricci;
		Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro termo da sequência: ");
        anterior = entrada.nextInt();
        System.out.print("Digite o segundo termo da sequência: ");
        proximo = entrada.nextInt();
        System.out.print("Digite a quantidade de termos da sequência: ");
        quantidadeTermos = entrada.nextInt();
        
        entrada.close();

        for (int i = 1; i <= quantidadeTermos; i++) {
            System.out.print(anterior + " ");
            ricci = anterior + proximo;
            anterior = proximo;
            proximo = ricci;
        }
        System.out.println();
    }
}
