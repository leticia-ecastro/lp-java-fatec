//Escreva um programa em Java para ler 10 valores, calcular e escrever a média aritmética desses valores lidos.

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main (String[] args) {
		int numero, media;
		int auxiliar = 0;
		Scanner entrada = new Scanner (System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite um numero: ");
			numero = entrada.nextInt();
			auxiliar += numero; //auxiliar = auxiliar + entrada;
			//auxiliar = receberá a soma de todos os números digitados pelo usuário!
		}
		entrada.close();
		
		media = auxiliar / 10;
		System.out.print("Media aritmetica = " + media);
	}
}

