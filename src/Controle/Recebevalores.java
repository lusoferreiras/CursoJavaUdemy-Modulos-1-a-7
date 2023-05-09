package Controle;
/*Crie um programa que recebe 10 valores e ao final imprima o maior número.
 * 
 */

import java.util.Scanner;

public class Recebevalores {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int maiorValor = 0;
		int contador = 0;
		
		do {
			System.out.println("\n Digite um número: ");
			int valor = read.nextInt();
			
			if(valor > maiorValor) {
				maiorValor = valor;
			}
			contador++;
			
		}while (contador != 10);
		System.out.printf("O maior valor foi: " +maiorValor);
		read.close();

	}

}
