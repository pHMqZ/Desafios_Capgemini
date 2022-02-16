/*
 * Duas palavras podem ser consideradas anagramas 
 si mesmas 
 * se as letras de uma palavra podem ser realocadas para formar a outra palavra. 
 * Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.
 * Exemplo:
 * 
 * Exemplo 1:
 * Entrada:
 * ovo
 * 
 * Saída:
 * 3
 * 
 * Explicação:
 * A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0, 2], [0, 1], [1, 2]] respectivamente.
 * 
 * 
 * Exemplo 2:
 * Entrada:
 * ifailuhkqq
 * 
 * Saída:
 * 3
 * 
 * Explicação:
 * A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0, 3]], [[8, 9]] e [[0, 1, 2], [1, 2, 3]].
 */

/**
 * @author Phillip
 */

package desafios;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio3_Anagramas {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a palavra a ser analisada: ");
		String p = sc.next();
		

		anagramas(p);

		sc.close();

	}

	public static void anagramas(String a) {

		String[] word = new String[256];

		int count = 0;
		int igual = 0;

		for (int i = 0; i < a.length(); i++) {
			for (int j = i; j < a.length(); j++) {
				char[] c = a.substring(i, j + 1).toCharArray();
				Arrays.sort(c);
				word[count] = String.valueOf(c);
				count++;
			}
		}
		
		for (int i = 0; i < count; i++) {
			for (int j = i; j < count; j++) {
				if (word[i].equals(word[j + 1])) {
					igual++;
				}
			}
		}
		System.out.println(igual);
	}
}