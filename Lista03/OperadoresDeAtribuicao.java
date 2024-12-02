/*
 * Crie um arquivo chamado OperadoresDeAtribuicao.java. Complete o código, substituindo a sequência xxxxx com operações de atribuição. O programa deve exibir os valores 1, 3, 2, 6, 3, 1, 2 e 1 nessa ordem. Não utilize o mesmo operador duas ou mais vezes.
 * int a xxxxx 1;	System.out.println(a);
 * a xxxxx 2;		System.out.println(a);
 * * a xxxxx 1;		System.out.println(a);
 * a xxxxx 3;		System.out.println(a);
 * a xxxxx 2;		System.out.println(a);
 * a xxxxx 2;		System.out.println(a);
 * a xxxxx;			System.out.println(a);
 * a xxxxx;			System.out.println(a);
* */

public class OperadoresDeAtribuicao {
	
	public static void main (String[] args) {
		int a = 1; 
		System.out.println(a); //Saída: 1
		a += 2; 
		System.out.println(a); //Saída: 3
		a -= 1;
		System.out.println(a); //Saída: 2
		a *= 3;
		System.out.println(a); //Saída: 6
		a /= 2;
		System.out.println(a); //Saída: 3
		a %= 2; //3/2 tem resto = 1
		System.out.println(a); //Saída: 1
		a++;
		System.out.println(a); //Saída: 2
		a--;
		System.out.println(a); //Saída: 1
	}
}

