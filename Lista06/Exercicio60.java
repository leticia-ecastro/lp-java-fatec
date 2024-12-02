//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio60 {
	
	public static void main (String[] args) {
		int anterior, proximo, termo, ricci;
		boolean encontrou = false;
		Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro termo da sequência: ");
        anterior = entrada.nextInt();
        System.out.print("Digite o segundo termo da sequência: ");
        proximo = entrada.nextInt();
        System.out.print("Digite um termo: ");
        termo = entrada.nextInt();
        
        entrada.close();

         while (!encontrou && anterior <= termo) {
            System.out.print(anterior + " ");
            if (anterior == termo) {
                encontrou = true;
                break;
            }
            ricci = anterior + proximo;
            anterior = proximo;
            proximo = ricci;
        }
        System.out.println("\nO termo " + termo + " foi encontrado na sequência de Ricci? " + (encontrou ? "Sim" : "Não"));
    }
}
