/* Faça um programa ("Aula02_05.java") que receba seu nome e seu código de matrícula, através do parâmetro "args" (da função "main"), e imprima esses valores na tela.
 */

import java.util.Scanner;

class Principal{
	
	public static void main(String[] args){

		Scanner texto = new Scanner(System.in);

		System.out.print("Digite o nome: ");

		Scanner idade = new Scanner(System.in);

		System.out.println("Insira a idade: ");

		System.out.println("O nome é " + texto.next() + " e a sua idade " + idade.next());
	}
}

