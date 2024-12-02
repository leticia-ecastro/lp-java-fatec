//Crie um arquivo chamado AprovadoReprovadoRandom.java. Gere um número aleatório com valores entre 0 e 10 (inclusos) e atribua a variável nota. O programa deve exibir a mensagem REPROVADO quando a nota do aluno for menor do que 6 ou APROVADO caso contrário.

import java.util.Random;

public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
	Random nota = new Random();
	double notaAleatoria = nota.nextDouble(0, 11);
		if (notaAleatoria < 6) {
			System.out.printf("Nota %.0f = REPROVADO!", notaAleatoria);
		} else {
			System.out.printf("Nota %.0f = APROVADO!", notaAleatoria);
		}
	}
}

