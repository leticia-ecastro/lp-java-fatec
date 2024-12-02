//Escreva um programa em Java para ler 10 números. Todos os números lidos com valor inferior a 40 devem ser somados. Escreva o valor final da soma efetuada.

import java.util.Scanner;

public class Exercicio13 {
	
	public static void main (String[] args) {
		int numero, soma = 0;
		Scanner entrada = new Scanner (System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ") Digite um numero: ");
			numero = entrada.nextInt();
			
			if (numero < 40) {
				soma += numero;
			}
		}
		entrada.close();
		
		System.out.print("Soma dos numeros menores que 40: " + soma);
	}
}
