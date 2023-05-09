package Fundamentos;

import java.util.Scanner;

public class Areatriangulo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double area, altura, base;
		
		System.out.println("Digite o valor da base: ");{
			base = leia.nextDouble();
		}
		System.out.println("Digite o valor da altura: ");{
			altura = leia.nextDouble();
		}
		
		area = base*altura/2;
		
		System.out.println("Resultado do valor da area: "+area);
		

	}

}
