//Escreva um programa em Java para ler 2 valores, calcular e escrever a soma dos inteiros existentes entre os 2 valores lidos (incluindo os valores lidos na soma). Agora, considere que o segundo valor lido poderá ser maior ou menor que o primeiro valor lido, ou seja, deve-se testá-los.

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main (String[] args) {
		int auxiliar, numero1, numero2, intervalo = 0;
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite um numero: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite um egundo numero: ");
		numero2 = entrada.nextInt();
		entrada.close();
		
		if (numero1 > numero2) { //ex: 10 e 2
			auxiliar = numero2; //auxiliar = 2
			numero2 = numero1; //numero2 = 10
			numero1 = auxiliar; //numero1 = 2
		}
		
		for (int i = numero1; i <= numero2; i++) {
			intervalo += i;
		}
		
		System.out.printf("Soma dos numeros entre %d e %d = %d.", numero1, numero2, intervalo);
	}
}

