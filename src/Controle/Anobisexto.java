package Controle;

import java.util.Scanner;

public class Anobisexto {

	public static void main(String[] args) {
		
		Scanner read =  new Scanner(System.in);
		
		System.out.println("Digite o ano: ");
		int ano  = read.nextInt();
		
		int bissexto = ano % 4;
		
		if (bissexto == 0) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é ano bissexto");
		}
		read.close();
	}

}
