//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio28 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean estaContido = false;
		int posicaoInicial = 0;
		int[] AH = new int[25], AI = new int[2];
		for(int i = 0;i < 25;i++){
			System.out.print("Digite o elemento " + i + " do vetor AH: ");
			AH[i] = entrada.nextInt();
		}
		for(int i = 0;i < 2;i++){
			estaContido = false;
			System.out.print("Digite o elemento " + i + " do vetor AI: ");
			AI[i] = entrada.nextInt();
			for(int j = 0;j < 25;j++){
				if(AH[j] == AI[i]){
					estaContido = true;
					if(i == 0 || j < posicaoInicial){
						posicaoInicial = j;
					}
				}
			}
		}
		if(estaContido == true){
			System.out.print("O vetor AI esta contido no vetor AH, e sua posicao inicial nele e " + posicaoInicial);
		} else{
			System.out.print("O vetor AI nao esta contido no vetor AH.");
		}
	}
}
