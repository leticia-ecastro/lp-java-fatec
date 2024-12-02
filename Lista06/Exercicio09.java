//Escreva um programa em Java para ler 10 valores e escrever quantos desses valores lidos estão no intervalo [10,20] (incluindo os valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo.

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main (String[] args) {
		int numero, contadorIntervalo = 0, contadorIntervaloFora = 0;
		Scanner entrada = new Scanner (System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º numero: ");
			numero = entrada.nextInt();
			if (numero >= 10 && numero <= 20) {
				contadorIntervalo++;
			} else {
				contadorIntervaloFora++;
			}
		}
		entrada.close();
		
		System.out.print("Dentro do intervalo [10,20]: " + contadorIntervalo + " numeros digitados. \nFora do intervalo [10,20]: " + contadorIntervaloFora + " numeros digitados.");
	}
}
