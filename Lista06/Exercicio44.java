//Solicite ao usuário a quantidade de termos da sequência de fatoriais e imprima o resultado.

import java.util.Scanner;

public class Exercicio44 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
        int quantidadeTermos = 0;
        
        do {
            System.out.print("Digite a quantidade de termos: ");
            quantidadeTermos = entrada.nextInt();
            if (quantidadeTermos < 1 || quantidadeTermos > 10) {
                System.out.println("Digite uma quantidade de termos entre 1 e 10!");
            }
        } while (quantidadeTermos < 1 || quantidadeTermos > 10);
        
        entrada.close();
        
        int fatorial;
        
        for (int i = 1; i <= quantidadeTermos; i++) {
            fatorial = 1;
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.printf("%d! = %d\n", i, fatorial);
        }
	}
}

