package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String ("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println(s2);
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim())); 
		
		//o .trim() retira os espeços digitados
		// o .equals faz a comparação dos Strings
		
		entrada.close();
	}

}
