//Escreva um programa em Java para ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main (String[] args) {
		int inicio, termino, duracao;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite a hora que a partida foi iniciada: ");
		inicio = entrada.nextInt();
		System.out.print("Digite a hora que a partida foi encerrada: ");
		termino = entrada.nextInt();
		entrada.close();
		duracao = termino - inicio;
		if (duracao <= 0) {
			duracao += 24;
		}
		System.out.printf("A partida durou %d horas.", duracao);
	}
}

