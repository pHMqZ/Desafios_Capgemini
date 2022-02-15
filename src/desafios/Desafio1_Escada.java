/*
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. 
 * A base e altura da escada devem ser iguais ao valor de n. 
 * A última linha não deve conter nenhum espaço.
 * 
 * Exemplo:
 * - Entrada 
 * 
 * n = 6
 *  
 * - Saída
 *      *
 *     **
 *    ***
 *   ****
 *  *****
 * ******  
 * 
 */

/**
 * @author Phillip
 */

package desafios;
import java.util.Scanner;

public class Desafio1_Escada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o tamanho da escada? ");
		int n = sc.nextInt();

		
		for (int altura = 1; altura <= n; altura++) {
			for (int espacos = 1; espacos <= n - altura; espacos++) {
				System.out.print(" ");
			}

			for (int ast = 1; ast <= altura; ast++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
