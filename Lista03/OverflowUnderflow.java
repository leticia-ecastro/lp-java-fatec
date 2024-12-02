/* Crie um arquivo chamado OverflowUnderflow.java. Complete o código, substituindo a sequência xxxxx com valores literais. O programa deve exibir os números -2147483648 e 2147483647, nessa ordem.
 * System.out.println( xxxxx + 1);
 * System.out.println( xxxxx - 1);
*/

public class OverflowUnderflow {
	
	public static void main (String[] args) {
		System.out.println(-2147483649L + 1); //Saída: -2147483648
		System.out.println(2147483648L - 1); //Saída: 2147483647
	}
}

