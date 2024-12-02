//Letícia Elaine de Castro

public class Exercicio02 {
	
	public static void main (String[] args) {
		int[] vetorB = new int[5];
		
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = (int) (Math.random() * 5) + 1;
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println("\nOrdem invertida: ");
		
		for (int i = vetorB.length - 1; i >=0; i--) {
			System.out.print(vetorB[i] + " ");
		}
	}
}

