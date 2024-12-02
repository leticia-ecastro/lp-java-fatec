//Crie um arquivo chamado VerificaValorProduto.java. Solicite ao usuário que digite os valores para as variáveis precoProduto1 e precoProduto2. O programa deve testar o valor digitado pelo usuário, para as duas variáveis e caso não estejam na faixa de 1 até 1000 (inclusos), exibir a mensagem VALOR INVALIDO e finalizer o programa. Caso os valores digitados sejam válidos, exibir a mensagem O produto 1 é o mais barato quando o preço do primeiro produto for menor. Caso contrário, se o preço do segundo produto for menor, a mensagem O produto 2 é o mais barato deve ser exibida. Caso contrário, a mensagem Os preços dos dois produtos são iguais é que deve ser exibida.

import java.util.Scanner;

public class VerificaValorProduto {
	
	public static void main (String[] args) {
		double precoProduto1, precoProduto2;
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o preco do produto 1: ");
		precoProduto1 = entrada.nextDouble();
		
		while (precoProduto1 < 1 || precoProduto1 > 1000) {
			System.out.print("Valor inválido! Informe um valor entre R$1,00 e R$1.000,00: ");
			precoProduto1 = entrada.nextDouble();
		}
		
		System.out.print("Digite o preco do produto 2: ");
		precoProduto2 = entrada.nextDouble();
		
		while (precoProduto2 < 2 || precoProduto2 > 1000) {
			System.out.print("Valor inválido! Informe um valor entre R$1,00 e R$1.000,00: ");
			precoProduto2 = entrada.nextDouble();
		}
		
		entrada.close();
		
		if (precoProduto1 >= 1 && precoProduto1 <= 1000 && precoProduto2 >= 1 && precoProduto2 <= 1000) {
			if (precoProduto1 > precoProduto2) {
				System.out.printf("O produto 2 (R$%.2f) é o mais barato", precoProduto2);
			} else if (precoProduto1 < precoProduto2) {
				System.out.printf("O produto 1 (R$%.2f) é o mais barato", precoProduto1);
			} else {
				System.out.printf("Os precos dos dois produtos são iguais.");
			}
		}
	}
}
