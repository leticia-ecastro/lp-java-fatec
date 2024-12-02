/* 
Escreva um programa em Java para ler as notas da 1a e 2a avaliações de um aluno, calcule e imprima a média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. Ao final da execução a mensagem 'NOVO CALCULO (S ou N)?' deve ser apresentada. Se for respondido 'S' deve retornar e executar um novo cálculo, caso contrário deverá encerrar o programa.
*/

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		Scanner novaEntrada = new Scanner (System.in);
		double nota1, nota2, media;
		char resposta;
		
		do {
			do {
				System.out.print("Digite a nota da primeira avaliacao: ");
				nota1 = entrada.nextDouble();
				if (nota1 < 0 || nota1 > 10) {
				System.out.println("ATENÇAO: Digite uma nota entre 0 e 10.");
				}
			} while (nota1 < 0 || nota1 > 10);
			do {
				System.out.print("Digite a nota da segunda avaliacao: ");
				nota2 = entrada.nextDouble();
				if (nota2 < 0 || nota2 > 10) {
				System.out.println("ATENÇAO: Digite uma nota entre 0 e 10.");
				}
			} while (nota2 < 0 || nota2 > 10);
			
			media = (nota1 + nota2) / 2;
			
			System.out.println("Média das notas: " + media);
			
			System.out.print("\nNovo calculo? Digite s = sim | n = nao: ");
			resposta = novaEntrada.nextLine().toLowerCase().charAt(0);
		//nextLine = esvazia o buffer do teclado
		//ToLowerCase = transforma tudo em minúsculo
		//charAt(0) = seleciona o caracter da posição 0 digitada
		} while (resposta == 's');
		
		entrada.close();
		novaEntrada.close();
		
		System.out.print("\nFim do programa.");
	}
}
