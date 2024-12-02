/*A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Escreva um programa em Java para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
 * a) Média de salário da população;
 * b) Média do número de filhos;
 * c) Maior salário dos habitantes;
 * d) Percentual de pessoas com salário menor que R$ 150,00.
 * Obs.: O final das leituras dos dados se dará com a entrada de um salário negativo
 */

import java.util.Scanner;

public class Exercicio23 {
	
	public static void main (String[] args) {
		int quantidadeFilhos = 0, acumuladorFilhos = 0, populacao = 0, salarioAbaixoDe150 = 0;
		double salario = 0, acumuladorSalario = 0, maiorSalario = 0;
		Scanner entrada = new Scanner (System.in);
		
		do {
			System.out.print("Digite o salario: ");
			salario = entrada.nextDouble();
			acumuladorSalario += salario;
			if (salario < 0) {
				break;
			}
			System.out.print("Digite a quantidade de filhos: ");
			quantidadeFilhos = entrada.nextInt();
			acumuladorFilhos += quantidadeFilhos;
			populacao++;
			if (salario < 150) {
				salarioAbaixoDe150++;
			}
			if (populacao == 1) {
				maiorSalario = salario;
			}
			if (salario > maiorSalario) {
				maiorSalario = salario;
			}
		} while (true);
		entrada.close();
		
		double mediaSalarioPopulacao = acumuladorSalario / populacao;
		double mediaQuantidadeFilhos = (double) quantidadeFilhos / populacao;
		double percentualSalarioAbaixoDe150 = (double) salarioAbaixoDe150 / populacao * 100;
		
		System.out.printf("Media de salario da populacao: R$%.2f", mediaSalarioPopulacao);
		System.out.printf("\nMedia do numero de filhos: %.1f", mediaQuantidadeFilhos);
		System.out.printf("\nMaior salario informado: R$%.2f", maiorSalario);
		System.out.printf("\nPercentual de pessoas com salario inferior a R$150,00: %.2f", percentualSalarioAbaixoDe150);
	}
}

