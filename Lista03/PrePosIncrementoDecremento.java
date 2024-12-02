/* Crie um arquivo chamado PrePosIncrementoDecremento.java. Complete o código, substituindo a sequência xxxxx com os operadores de incremento e decremento. O programa deve exibir os valores 1, 3, 3 e 1 nessa ordem. Não é necessário preencher todas as seqüências.
 * int a = 1;
 * System.out.println( xxxxx a xxxxx );
 * System.out.println( xxxxx a xxxxx );
 * System.out.println( xxxxx a xxxxx );
 * System.out.println( xxxxx a xxxxx );
*/

public class PrePosIncrementoDecremento {
	
	public static void main (String[] args) {
		int a = 1;
		System.out.println(a++); //Saída: 1
		System.out.println(++a); //Saída: 3		(2 + 1 = 3)
		System.out.println(a--); //Saída: 3
		System.out.println(--a); //Saída: 1		(2 - 1 = 1)
	}
}

