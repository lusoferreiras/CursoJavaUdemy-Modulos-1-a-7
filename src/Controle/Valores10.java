package Controle;

import java.util.Scanner;
/*Crie um programa que receba um número e verifique se ele está
 * entre 0 e 10 e é par
 */

public class Valores10 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero  = read.nextInt();
		
		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("O número " +numero + " está entre 0 e 10 e é um par.");
			} else {
				System.out.println("O número " +numero + " está entre 0 e 10 mas não é um par.");
			}
		} else {
			System.out.println("O número "+ numero + " não está entre 0 e 10.");
		}
		read.close();
	}

}
