//Escreva um programa em Java para ler um valor e escrever a mensagem “É MAIOR QUE 10!” se o valor lido for maior que 10, caso contrário escrever “NÃO É MAIOR QUE 10!”.

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main (String[] args) {
		int valor;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite um valor: ");
		valor = entrada.nextInt();
		entrada.close();
		if (valor > 10) {
			System.out.print("O valor digitado é maior que 10!");
		} else {
			System.out.print("O valor digitado nao é maior que 10!");
		}
	}
}

