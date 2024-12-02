//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio54 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		int a, b, c, termoInicial = 0, termoFinal = 10;
		a = 0;
		b = 1;
		c = a + b;
		
		System.out.print("Digite o termo inicial da sequencia: ");
		termoInicial = entrada.nextInt();
		
		System.out.print("Digite o termo final da sequencia: ");
		termoFinal = entrada.nextInt();
		
		System.out.print("\nTermos de Fibonacci: ");
		
		for (int termoAtual = 1; termoAtual <= termoFinal; termoAtual++) {
			if (termoAtual >= termoInicial) {
				System.out.print(a + " ");
			}
			a = b;
			b = c;
			c = a + b;
		}
	}
}

