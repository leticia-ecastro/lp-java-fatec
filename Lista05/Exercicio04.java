//Escreva um programa em Java para ler as notas da primeira e segunda avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String[] args) {
		double nota1, nota2, media;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite a nota da primeira avaliação: ");
		nota1 = entrada.nextDouble();
		System.out.print("Digite a nota da segunda avaliação: ");
		nota2 = entrada.nextDouble();
		entrada.close();
		media = (nota1 + nota2) / 2;
		if (media >= 6) {
			System.out.printf("Média = %.1f. APROVADO!", media);
		} else {
			System.out.printf("Média = %.1f. REPROVADO!", media);
		}
	}
}

