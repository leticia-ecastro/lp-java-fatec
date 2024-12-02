/* 
 * Indique os tipos da linguagem Java que aceitam cada valor da lista abaixo.
 * a. "Bom dia"
 * b. 3
 * c. 235.13
 * d. true
 * e. -135
 * f. 256.23F
 * g. 'A'
 * h. 6463275245745L
 */

public class ExercicioSete {
	
	public static void main (String[] args) {
		String frase = "Bom dia!";
		byte b = 3;
		double d = 235.13;
		boolean status = true;
		int num = -135;
		float f = 256.23F;
		char letra = 'A';
		long numero = 6463275245745L;
		System.out.println("String: " + frase);
		System.out.println("Double: " + d);
		System.out.println("Boolean: " + status);
		System.out.println("Int: " + num);
		System.out.println("Float: " + f);
		System.out.println("Char: " + letra);
		System.out.println("Long: " + numero);
	}
}

