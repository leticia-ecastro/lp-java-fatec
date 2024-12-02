/* 
 * Crie um arquivo chamado TestaTiposPrimitivos.java. Implemente um programa em Java que declare uma variável de cada um dos tipos primitivos da linguagem Java. Essas variáveis devem serninicializadas com valores adequados. Por fim, exiba os valores dessas variáveis na saída padrão.
*/

public class TestaTiposPrimitivos {
	
	public static void main (String[] args) {
		byte byteMax = Byte.MAX_VALUE;
		short shortMax = Short.MAX_VALUE;
		int intMax = Integer.MAX_VALUE;
		long longMax = Long.MAX_VALUE;
		float floatMax = Float.MAX_VALUE;
		double doubleMax = Double.MAX_VALUE;
		char myChar = 'L';
		boolean verdadeiro = true;
		System.out.printf("Byte: %d\nShort: %d\nInt: %d\nLong: %d\nFloat: %f\nDouble: %f\nChar: %c\nBoolean: %b", byteMax, shortMax, intMax, longMax, floatMax, doubleMax, myChar, verdadeiro);
	}
}

