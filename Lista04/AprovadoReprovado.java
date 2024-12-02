//Crie um arquivo chamado AprovadoReprovado.java. Solicite ao usuário que digite o valor para a variável nota. O programa deve testar o valor digitado pelo usuário e caso não esteja na faixa de 0 até 10 (inclusos), exibir a mensagem VALOR INVALIDO e finalizer o programa. Caso o valor digitado seja válido, exibir a mensagem REPROVADO quando a nota do aluno for menor do que 6 ou APROVADO caso contrário.

import java.util.Scanner;
import java.util.Random;

public class AprovadoReprovado {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		int nota;
		System.out.print("Digite sua nota: ");
		nota = entrada.nextInt();
		
		while (nota <= 0 || nota >= 10) {
			System.out.print("Valor inválido! Digite uma nota válida: ");
			nota = entrada.nextInt();
		}
		
		entrada.close();
			
		if (nota < 6) {
			System.out.println("Situação: REPROVADO!");
		} else {
			System.out.println("Situação: APROVADO!");
		}	
	}
}

