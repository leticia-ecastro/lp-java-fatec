/* 
 * Crie um arquivo chamado ExibeValores.java. Implemente um programa em Java que armazene em variáveis os valores 19, 1571, 100000, 2147483648, 3.14, 3.141592653589793, true e 'K'.
* Utilize sempre o tipo primitivo adequado que ocupe o menor espaço possível. 
* Defina os nomes que achar mais apropriado para essas variáveis. 
* Por fim, exiba os valores dessas variáveis na saída padrão.
*/

public class ExibeValores {
	
	public static void main (String[] args) {
		byte numeroByte = 19;
		short numeroShort = 1571;
		int numeroInt = 100000;
		long numeroLong = 2147483648l;
		float numeroFloat = 3.14f;
		float numberFloat = 3.141592653589793f;
		boolean valorBoolean = true;
		char letraChar = 'K';
		System.out.printf("Byte = %d \n", numeroByte);
		System.out.printf("Short = %d \n", numeroShort);
		System.out.printf("Int = %d \n", numeroInt);
		System.out.printf("Long = %d \n", numeroLong);
		System.out.printf("Float = %.2f \n", numeroFloat);
		System.out.printf("Float = %f \n", numberFloat);
		System.out.printf("Boolean = %b \n", valorBoolean);
		System.out.printf("Char = %c \n", letraChar);
		System.out.printf("\nByte = %d \nShort = %d \nInt = %d \nLong = %d \nFloat = %.2f \nFloat = %f \nBolean = %b \nChar = %c \n", numeroByte, numeroShort, numeroInt, numeroLong, numeroFloat, numberFloat, valorBoolean, letraChar);
	}
}

