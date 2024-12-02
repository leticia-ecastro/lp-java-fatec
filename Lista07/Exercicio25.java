//Letícia Elaine de Castro

//Escreva um programa validador de senhas. A regra para a criação de uma senha forte é que a senha deve ser de tamanho mínimo 10. A senha deve conter letras maiúsculas, letras minúsculas, números e caracteres especiais/símbolos (!@#$%&*()+). Outra regra, deve ter pelo menos 3 caracteres (maiúsculo ou minúsculo), pelo menos 3 números e pelo menos 2 símbolos. O programa deve solicitar uma senha forte ao usuário até ele conseguir uma senha que respeite esses critérios. Após cada senha digitada, apresentar as regras e se a senha passou pelos quesitos ou não.

import java.util.Scanner;

public class Exercicio25 {
	
	public static void main (String[] args) {
		String senha = "";
		String simbolos = "!@#$%&*()+";
		boolean senhaForte = false;
		int contadorLetras = 0, contadorSimbolos = 0, contadorNumeros = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		do {
			System.out.print("Digite a senha: ");
			senha = entrada.nextLine();
			
			for (int i = 0; i < senha.length(); i++) {
				if (senha.charAt(i) >= 'a' && senha.charAt(i) <= 'z') {
					contadorLetras++;
				}
				if (senha.charAt(i) >= 'A' && senha.charAt(i) <= 'Z') {
					contadorLetras++;
				}
				if (senha.charAt(i) >= '0' && senha.charAt(i) <= '9') {
					contadorNumeros++;
				}
				
				for (int j = 0; j < simbolos.length(); j++) {
					if (senha.charAt(i) == simbolos.charAt(j)) {
						contadorSimbolos++;
					}
				}
			}
			
			if (senha.length() >= 10) {
				if (contadorLetras >= 3 && contadorNumeros >= 3 && contadorSimbolos >= 2) {
					System.out.print("Senha aprovada! Parabens!");
					senhaForte = true;
				} else {
					System.out.println("Senha reprovada! Tente novamente.");
				}
			} else {
				System.out.println("A senha deve ter, no minimo, 10 caracteres!");
			}
			
		} while (!senhaForte); // while (true)
		
	}
}

