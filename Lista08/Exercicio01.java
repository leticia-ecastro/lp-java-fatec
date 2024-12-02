//Letícia Elaine de Castro

public class Exercicio01 {
	
	public static void main (String[] args) {
		int[] vetorA = new int[15];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int)(Math.random() * 15) + 1;
			System.out.print(vetorA[i] + " ");
		}
		
	}
}

