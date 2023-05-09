package Fundamentos;

import java.util.Scanner;

public class quadradoCubo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double valor, quadrado, cubo;
		
		System.out.println("Digite valor: ");{
			valor = leia.nextDouble();
		}
		quadrado = Math.pow(valor, 2);
		System.out.println("Valor ao quadrado: "+quadrado);
		
		cubo = Math.pow(valor, 3);
		System.out.println("Valor ao cubo: "+cubo);

	}

}
