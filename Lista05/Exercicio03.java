//As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12. Escreva um programa em Java que leia o número de maçãs compradas, calcule e escreva o custo total da compra.

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main (String[] args) {
		int qtdeMaca;
		double valorTotal;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite a quantidade de maçãs compradas: ");
		qtdeMaca = entrada.nextInt();
		entrada.close();
		if (qtdeMaca < 12) {
			valorTotal = qtdeMaca * 1.3;
			System.out.printf("Valor total da compra: R$%.2f.", valorTotal);
		} else {
			valorTotal = qtdeMaca * 1;
			System.out.printf("Valor total da compra: R$%.2f.", valorTotal);
		}
	}
}

