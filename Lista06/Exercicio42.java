//Construa um programa para mostrar o fatorial dos números inteiros na faixa de 1 a 10.

public class Exercicio42 {
	
	public static void main (String[] args) {
        int fatorial;
        System.out.println("Fatoriais de 1 a 10: ");
        
        for (int i = 1; i <= 10; i++) {
            fatorial = 1;
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.printf("%d! = %d\n", i, fatorial);
		}
	}
}

