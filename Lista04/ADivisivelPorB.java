//Crie um arquivo chamado ADivisivelPorB.java. Implemente um programa em Java que guarde dois valores numéricos inteiros: a e b, informados pelo usuário, sendo a de 0 até 1000 (inclusos) e b de 0 a 20 (inclusos). Valide os valores digitados pelo usuário, informando caso não sejam validos. Valide, também, se o valor de 1 é maior ou igual ao valor de b, caso não seja, informe ao usuário. Exiba na saída padrão a mensagem É divisível quando a for divisível por b ou a mensagem Não é divisível, caso contrário.

import java.util.Scanner;

public class ADivisivelPorB {
	
	public static void main (String[] args) {
		int valorA, valorB;
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o valor de A: ");
		valorA = entrada.nextInt();
		
		while (valorA < 1 || valorA > 1000) {
			System.out.print("O valor de A é inválido! Digite um valor de 0 até 1000: ");
			valorA = entrada.nextInt();
		}
		
		System.out.print("Digite o valor de B: ");
		valorB = entrada.nextInt();
		
		while (valorB < 1 || valorB > 20) {
			System.out.print("O valor de B é inválido! Digite um valor de 1 a 20: ");
			valorB = entrada.nextInt();
		}
		
		entrada.close();
		
		if (valorA % valorB == 0) {
			System.out.println("A é divisível por B.");
		} else {
			System.out.println("A NAO é divisível por B.");
		}
	}
}
	


