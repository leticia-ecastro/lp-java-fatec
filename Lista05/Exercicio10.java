//Escreva um programa em Java para ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main (String[] args) {
		double salario, valorVendas, comissao, salarioTotal;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite o valor do salario fixo do funcionario: ");
		salario = entrada.nextDouble();
		System.out.print("Digite o valor total das vendas efetuadas pelo vendedor: ");
		valorVendas = entrada.nextDouble();
		entrada.close();
		
		if (valorVendas <= 1500) {
			comissao = valorVendas * 0.03;
			salarioTotal = salario + comissao;
		} else {
			comissao = valorVendas * 0.03 + (valorVendas - 1500) * 0.05;
			salarioTotal = salario + comissao;
		}
		System.out.printf("Salario total: R$%.2f.", salarioTotal);
	}
}

