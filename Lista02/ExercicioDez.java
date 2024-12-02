/* 
 * Considere um sistema de gerenciamento de mercadorias de uma loja. Implemente um programa que declare variáveis para representar os seguintes dados: número do pedido, código do produto, quantidade e valor total da compra. 
* Inicialize essas variáveis com valores apropriados. Por fim, exiba os valores armazenados.
*/

public class ExercicioDez {
	
	public static void main (String[] args) {
		String numPedido = "0001";
		String codigoProduto = "XY123";
		double quantidade = 20;
		double valorCompra = 315.22;
		System.out.printf("Número do pedido: %s\nCódigo do Produto: %s\nQuantidade: %.0f\nValor total da Compra: R$%.2f", numPedido, codigoProduto, quantidade, valorCompra);
	}
}

