//Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um programa em Java que permita a entrada das seguintes informações: a) o número total de mercadorias no estoque; b) o valor de cada mercadoria. Ao final imprimir o valor total em estoque e a média de valor das mercadorias. Agora não será informado o número de mercadorias em estoque. Então o funcionamento deverá ser da seguinte forma: ler o valor da mercadoria e perguntar ‘MAIS MERCADORIAS (S/N)?’. Ao final, imprimir o valor total em estoque e a média de valor das mercadorias em estoque.

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		Scanner entradaStr = new Scanner (System.in);
		
		int quantidadeDeMercadoria = 0;
		double valorTotalMercadoria = 0;
		char resposta;
		
		do {
			System.out.print("Digite o valor da mercadoria: ");
			valorTotalMercadoria += entrada.nextDouble(); //Soma os valores das mercadorias digitadas
			quantidadeDeMercadoria++; //contador de mercadorias
			
			System.out.print("Deseja adicionar mais mercadorias? Digite s = sim | n = nao: ");
			resposta = entradaStr.nextLine().toLowerCase().charAt(0);
		} while (resposta == 's');
		entrada.close();
		
		System.out.printf("Valor total em estoque: R$%.2f. \n", valorTotalMercadoria);
		
		double media = valorTotalMercadoria / quantidadeDeMercadoria;
		System.out.printf("Media de valor das mercadorias: R$%.2f.", media);
	}
}

