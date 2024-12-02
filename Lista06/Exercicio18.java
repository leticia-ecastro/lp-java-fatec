// Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um programa em Java que permita a entrada das seguintes informações: a) o número total de mercadorias no estoque; b) o valor de cada mercadoria. Ao final imprimir o valor total em estoque e a média de valor das mercadorias.

import java.util.Scanner;

public class Exercicio18 {
	
	public static void main (String[] args) {
		double valor = 0;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite a quantidade de mercadorias no estoque: ");
		int quantidade = entrada.nextInt();
		
		for (int i = 1; i <= quantidade; i++) {
			System.out.print("Digite o valor da mercadoria " + i + ": ");
			valor += entrada.nextInt();
		}
		entrada.close();
		
		double media = valor / quantidade;
		
		System.out.printf("Valor total em estoque: %d mercadorias | Media de valor das mercadorias: R$%.2f.", quantidade, media);
	}
}

