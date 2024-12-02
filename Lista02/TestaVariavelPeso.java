/* 
 * Crie um arquivo chamado TestaVariavelPeso.java. Implemente um programa em Java que declare uma variável do tipo double chamada peso. Essa variável deve ser inicializada com o valorndo seu peso. No final, exiba o valor dessa variável na saída padrão usando o println() e o printf().
*/

public class TestaVariavelPeso {
	
	public static void main (String[] args) {
		double peso = 69.5;
		System.out.println("Meu peso: " + peso);
		System.out.printf("Meu peso: %.2f", peso);
	}
}

