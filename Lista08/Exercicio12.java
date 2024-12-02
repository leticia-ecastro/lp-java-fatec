//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N = 0, M = 0;
		int[] P = new int[N], Q = new int[M], R = new int[N + M];
		
		while(N > 10 || N < 1){
			System.out.print("Digite o numero N, entre 1 e 10, de posicoes que o vetor P tem: ");
			N = entrada.nextInt();
			if(N > 10 || N < 1){
				System.out.print("Valor invalido. ");
			}
		}
		
		while(M > 15 || M < 1){
			System.out.print("Digite o numero M, entre 1 e 15, de posicoes que o vetor Q tem: ");
			M = entrada.nextInt();
			if(M > 15 || M < 1){
				System.out.print("Valor invalido. ");
			}
		}
		
		for(int i = 0;i < N;i++){
			System.out.print("Digite o valor inteiro da posicao " + i + " do vetor P: ");
			P[i] = entrada.nextInt();
			R[i] = P[i];
		}
		
		for(int i = 0;i < M;i++){
			System.out.print("Digite o valor inteiro da posicao " + i + " do vetor Q: ");
			Q[i] = entrada.nextInt();
			R[i + N] = Q[i];
		}
		
		System.out.print("Os valores do vetor P sao:");
		
		for(int i = 0;i < N;i++){
			System.out.print(" " + P[i]);
		}
		
		System.out.print("\nOs valores do vetor Q sao:");
		
		for(int i = 0;i < M;i++){
			System.out.print(" " + Q[i]);
		}
		
		System.out.print("\nOs valores do vetor R sao:");
		
		for(int i = 0;i < N + M;i++){
			System.out.print(" " + R[i]);
		}
	}
}
