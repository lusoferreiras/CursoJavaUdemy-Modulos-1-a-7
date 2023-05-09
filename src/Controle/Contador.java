package Controle;

import java.util.Scanner;
/*Criar um programa que receba um número e diga se ele é um número primo.
 */

public class Contador {

	public static void main(String[] args) {
		Scanner read =  new Scanner(System.in);
		
		int  contadorDeDivisores = 0;
		
		System.out.println("\nDigite um numero para verificar se é primo: ");
		int numero  = read.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if  (numero % i ==0) {
				contadorDeDivisores++;
			}
		}
		if(contadorDeDivisores == 0) {
			System.out.println("\nO número " + numero + " é primo.");
		} else {
			System.out.println("\nO numero " + numero + " não é primo.");
		}
		read.close();

	}

}
