//Crie um arquivo chamado ADivisivelPorBRandom.java. Implemente um programa em Java que guarde dois valores numéricos inteiros: a e b, gerados aleatoriamente, sendo a de 0 até 1000 (inclusos) e b de 0 a 20 (inclusos). Exiba na saída padrão a mensagem É divisível quando a for divisível por b ou a mensagem Não é divisível, caso contrário.

import java.util.Random;

public class ADivisivelPorBRandom_v2 {
	
	public static void main (String[] args) {
		int novoNumeroA = (int) (Math.random() * 1001);
		int novoNumeroB = (int) (Math.random() * 21);
		System.out.printf("A = %d | B = %d\n", novoNumeroA, novoNumeroB);
		 
		if (novoNumeroA % novoNumeroB == 0) {
			System.out.println("A é divisivel por B.");
		} else {
			System.out.println("A não é divisivel por B.");
		}
	}
}

