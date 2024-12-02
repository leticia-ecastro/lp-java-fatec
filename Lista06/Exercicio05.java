//Modifique o exercício anterior para aceitar somente valores maiores que 0 para N. Caso o valor informado (para N) não seja maior que 0, deverá ser lido um novo valor para N.

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite um numero: ");
		int n = entrada.nextInt();
		
		while (n <= 0) {
			System.out.print("Digite um numero maior que zero: ");
			n = entrada.nextInt();
		}
		entrada.close();
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		
	}
}

