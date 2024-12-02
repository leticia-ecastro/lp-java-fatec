//Escreva um programa validador de senhas. A regra para a criação de uma senha forte é que a senha deve ser de tamanho mínimo 10. A senha deve conter letras maiúsculas, letras minúsculas, números e caracteres especiais/símbolos (!@#$%&*()+). Outra regra, deve ter pelo menos 3 caracteres (maiúsculo ou minúsculo), pelo menos 3 números e pelo menos 2 símbolos. O programa deve solicitar uma senha forte ao usuário até ele conseguir uma senha que respeite esses critérios. Após cada senha digitada, apresentar as regras e se a senha passou pelos quesitos ou não.


import java.util.Scanner;

public class Exercicio25_v2 {
	
	static String simbolos = "!@#$%&*()+";
	
	public static void main (String[] args) {
		String senha = "Bgp2Ip4*@1";
		System.out.println("Tamanho(10): " + contaTamanho(senha) + " (" + (validaTamanho(senha, 10) ? "OK" : "X") + ")");
		System.out.println("Letras(3): " + contaLetras (senha) + " (" + (validaLetras(senha, 10) ? "OK" : "X") + ")");
		System.out.println("Numeros(3): " + contaNumeros (senha) + " (" + (validaNumeros(senha, 3) ? "OK" : "X") + ")");
		System.out.println("Simbolos(2): " + contaSimbolos (senha) + " (" + (validaSimbolos(senha, 2) ? "OK" : "X") + ")");
	}
	
	static int contaTamanho (String senha) {
		return senha.length();
	}
	
	static boolean validaTamanho (String senha, int tamanho) {
		return (contaTamanho (senha) >= tamanho);
	}
	
	static int contaLetras (String senha) {
		int contador = 0;
		senha = senha.toLowerCase();
		for (int i = 0; i < senha.length(); i++) {
			if (senha.charAt(i) >= 'a' && senha.charAt(i) <= 'z') {
				contador++;
			}
		}
		return contador;
	}
	
	static boolean validaLetras (String senha, int tamanho) {
		return (contaLetras (senha) >= tamanho);
	}
	
	static int contaNumeros (String senha) {
		int contador = 0;
		for (int i = 0; i < senha.length(); i++) {
			if (senha.charAt(i) >= '0' && senha.charAt(i) <= '9') {
				contador++;
			}
		}
		return contador;
	}
	
	static boolean validaNumeros (String senha, int tamanho) {
		return (contaNumeros (senha) >= tamanho);
	}
	
	static int contaSimbolos (String senha) {
		int contador = 0;
		for (int i = 0; i < senha.length(); i++) {
			for (int j = 0; j < simbolos.length(); j++) {
				if (senha.charAt(i) == simbolos.charAt(j)) {
				contador++;
				}
			}		
		}
		return contador;
	}
	
	static boolean validaSimbolos (String senha, int tamanho) {
		return (contaSimbolos(senha) >= tamanho);
	}
}
