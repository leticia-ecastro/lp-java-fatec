//Escreva um programa em Java para ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main (String[] args) {
		int anoNascimento, anoAtual, idade;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite o ano de seu nascimento: ");
		anoNascimento = entrada.nextInt();
		System.out.print("Digite o ano atual: ");
		anoAtual = entrada.nextInt();
		entrada.close();
		idade = anoAtual - anoNascimento;
		if (idade < 16) {
			System.out.print("Você NÃO poderá votar na eleição!");
		} else {
			System.out.print("Você poderá votar na eleição!");
		}
	}
}

