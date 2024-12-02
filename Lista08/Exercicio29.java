//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio29 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroPosicoes = 0, tentativa = 0, posicaoElemento = -1;
		while(numeroPosicoes < 10){
			System.out.print("Digite o numero maior ou igual a 10 posicoes que o vetor AJ tem: ");
			numeroPosicoes = entrada.nextInt();
			if(numeroPosicoes < 10){
				System.out.print("Valor invalido. ");
			}
		}
		int[] AJ = new int[numeroPosicoes];
		for(int i = 0;i < numeroPosicoes;i++){
			AJ[i] = (int) (Math.random() * 50);
		}
		System.out.print("Tente adivinhar um dos numeros no vetor AJ gerado em ate 10 tentativas!\n");
		for(int i = 0;(i < 10) && (posicaoElemento == -1);i++){
			System.out.print("Tentativa " + (i + 1) + ": ");
			tentativa = entrada.nextInt();
			for(int j = 0;j < numeroPosicoes;j++){
				if(tentativa == AJ[j]){
					posicaoElemento = j;
				}
			}
			if(posicaoElemento >= 0){
				System.out.print("Voce acertou! Este numero estava na posicao " + posicaoElemento + " do vetor");
			} else if(posicaoElemento == -1 && i != 9){
				System.out.print("Errou, tente novamente!\n");
			}
		}
		if(posicaoElemento == -1){
			System.out.print("Voce perdeu, boa sorte na proxima");
		}
	}
}
