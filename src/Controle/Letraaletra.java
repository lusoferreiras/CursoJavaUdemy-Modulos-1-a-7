package Controle;

import java.util.Scanner;

public class Letraaletra {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite a palavra: ");
		String palavra = read.nextLine();
		
		char letras[] = palavra.toCharArray();
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		read.close();
		
	}

}
