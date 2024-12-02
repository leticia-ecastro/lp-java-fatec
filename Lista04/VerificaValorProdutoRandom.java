//Crie um arquivo chamado VerificaValorProdutoRandom.java. Gere dois números aleatórios entre 1 e 1000 (inclusos), atribuindo as variáveis precoProduto1 e precoProduto2. O programa deve exibir a mensagem O produto 1 é o mais barato quando o preço do primeiro produto for menor. Caso contrário, se o preço do segundo produto for menor, a mensagem O produto 2 é o mais barato deve ser exibida. Caso contrário, a mensagem Os preços dos dois produtos são iguais é que deve ser exibida.

import java.util.Random;

public class VerificaValorProdutoRandom {
	
	public static void main (String[] args) {
		Random produto1 = new Random();
		double precoProduto1 = produto1.nextDouble(1, 1001);
		Random produto2 = new Random();
		double precoProduto2 = produto2.nextDouble(1, 1001);
		
		System.out.printf("Produto 1: R$%.2f \nProduto 2: R$%.2f\n\n", precoProduto1, precoProduto2);
		if (precoProduto1 < precoProduto2) {
			System.out.printf("O produto 1 (R$%.2f) é o mais barato.", precoProduto1);
		} else if (precoProduto1 > precoProduto2) {
			System.out.printf("O produto 2 (R$%.2f) é o mais barato.", precoProduto2);
		} else {
			System.out.printf("O preço dos dois produtos são iguais (R$%.2f).", precoProduto1);
		}
	}
}

