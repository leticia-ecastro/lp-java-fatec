//Letícia Elaine de Castro

import java.util.Scanner;

public class Exercicio29 {
	
	public static void main (String[] args) {
		String frase = "", saida = "";
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Insira uma frase: ");
		frase = entrada.nextLine().toLowerCase();
		
		entrada.close();
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == 'z') {
				saida += 'p';
			} else {
				if (frase.charAt(i) == 'e') {
					saida += 'o';
				} else {
					if (frase.charAt(i) == 'n') {
						saida += 'l';
					} else {
						if (frase.charAt(i) == 'i') {
							saida += 'a';
						} else {
							if (frase.charAt(i) == 't') {
								saida += 'r';
							} else {
								if (frase.charAt(i) == 'p') {
									saida += 'z';
								} else {
									if (frase.charAt(i) == 'o') {
										saida += 'e';
									} else {
										if (frase.charAt(i) == 'l') {
											saida += 'n';
										} else {
											if (frase.charAt(i) == 'a') {
												saida += 'i';
											} else {
												if (frase.charAt(i) == 'r') {
													saida += 't';
												} else {
													saida += frase.charAt(i);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.print("Saida: " + saida);
		
	}
}

