//Crie um arquivo chamado Saudacao.java. Implemente um programa em Java que declare uma variável chamada hora. Essa variável deve armazenar a hora do dia. Esse programa deve exibir a mensagem Zzzzz se a hora estiver no intervalo [0, 6], Bom dia se a hora estiver no intervalo [7, 11], Boa tarde se a hora estiver no intervalo [12, 17] ou Boa noite se a hora estiver no intervalo [18, 23]. Dê a opção do usuário informar a hora manualmente ou gerar a hora aleatoriamente, sempre fazendo todas as validações necessárias.

import java.util.Scanner;
import java.util.Random;

public class Saudacao {
	
	public static void main (String[] args) {
		int hora = 0, opcao;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Opcoes:\n[1] Digitar a hora\n[2] Gerar hora aleatoriamente\nSelecione a opcao desejada: ");
		opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1: 
				do {
					System.out.print("Digite a hora: ");
					hora = entrada.nextInt();
					if (hora < 0 || hora > 23) {
						System.out.print("Hora inválida!");
					}
					
				} while (hora < 0 || hora > 23);
				break;
				
			case 2:
				System.out.print("Hora gerada aleatoriamente: ");
				Random horaGerada = new Random();
				hora = horaGerada.nextInt(24);
				System.out.println(hora + "h");
				break;
		}
		
		if (opcao == 1 || opcao == 2) {
			if (hora >= 0 && hora <= 6) {
				System.out.print("Zzzzz");
			} else if (hora >= 7 && hora <= 11 ) {
				System.out.print("Bom dia!");
			} else if (hora >= 12 && hora <= 17 ) {
				System.out.print("Boa tarde!");
			} else {
				System.out.print("Boa noite!");
			}
		}
	}
}
