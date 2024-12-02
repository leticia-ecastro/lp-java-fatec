//Escreva um programa em Java para ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main (String[] args) {
		int valor1, valor2;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite o primeiro valor: ");
		valor1 = entrada.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = entrada.nextInt();
		while (valor1 == valor2) {
			System.out.println("Os valores informados devem ser diferentes!");
			System.out.print("Digite novamente um primeiro valor: ");
			valor1 = entrada.nextInt();
			System.out.print("Digite novamente um segundo valor: ");
			valor2 = entrada.nextInt();
			entrada.close();
		}

		if (valor1 > valor2) {
			System.out.print("O primeiro valor eh maior que o segundo valor digitado.");
		} else {
			System.out.print("O segundo valor eh maior que o primeiro valor digitado.");
		}
		
		
	}
}

