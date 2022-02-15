/*
 * Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
 * A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. 
 * O site considera uma senha forte quando ela satisfaz os seguintes critérios:
 *  - Possui no mínimo 6 caracteres.
 *  - Contém no mínimo 1 digito.
 *  - Contém no mínimo 1 letra em minúsculo.
 *  - Contém no mínimo 1 letra em maiúsculo.
 *  - Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+ 
 * 
 * Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. 
 * Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados 
 * para uma string qualquer ser considerada segura.
 * 
 * Exemplo:
 * 
 * Entrada:
 * Ya3
 * 
 * Saída:
 * 3
 * 
 * Explicação:
 * 
 * Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 
 * 2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.
 */

 
/**
 * @author Phillip
 */

package desafios;

import java.util.Scanner;

public class Desafio2_SenhaForte {
	public static void main(String[] args) {
		System.out.println("Digite sua senha: ");
		Scanner sc = new Scanner(System.in);

		String senha = sc.nextLine();

		verificaSenha(senha);
		

		sc.close();
	}

	
	public static void verificaSenha(String senha) {
		int tamanhoMinimo = 6;
		int caracteres = 0;
		String maiusculas = "(.*)[A-Z](.*)";
		String minusculas = "(.*)[a-z](.*)";
		String numeros = "(.*)[0-9](.*)";
		String especiais = "(.*)[!@#$%^&*()+-](.*)";
		
		if(!senha.matches(maiusculas)) {
			caracteres++;
		}
		
		if(!senha.matches(minusculas)) {
			caracteres++;
		}
		
		if(!senha.matches(numeros)) {
			caracteres++;
		}
		
		if(!senha.matches(especiais)) {
			caracteres++;
		}
		
		int ajuste = Math.max(tamanhoMinimo -senha.length(), caracteres);
		
		System.out.println(ajuste);
	}
	
}
