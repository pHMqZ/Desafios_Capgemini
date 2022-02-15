/*
 * D�bora se inscreveu em uma rede social para se manter em contato com seus amigos. 
 * A p�gina de cadastro exigia o preenchimento dos campos de nome e senha, por�m a senha precisa ser forte. 
 * O site considera uma senha forte quando ela satisfaz os seguintes crit�rios:
 *  - Possui no m�nimo 6 caracteres.
 *  - Cont�m no m�nimo 1 digito.
 *  - Cont�m no m�nimo 1 letra em min�sculo.
 *  - Cont�m no m�nimo 1 letra em mai�sculo.
 *  - Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+ 
 * 
 * D�bora digitou uma string aleat�ria no campo de senha, por�m ela n�o tem certeza se � uma senha forte. 
 * Para ajudar D�bora, construa um algoritmo que informe qual � o n�mero m�nimo de caracteres que devem ser adicionados 
 * para uma string qualquer ser considerada segura.
 * 
 * Exemplo:
 * 
 * Entrada:
 * Ya3
 * 
 * Sa�da:
 * 3
 * 
 * Explica��o:
 * 
 * Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 
 * 2 caracteres n�o s�o suficientes visto que a senha precisa ter um tamanho m�nimo de 6 caracteres.
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
