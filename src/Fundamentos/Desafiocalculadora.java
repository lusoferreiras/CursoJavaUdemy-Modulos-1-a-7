package Fundamentos;

import java.util.Scanner;



public class Desafiocalculadora {


	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - * / %
		Scanner leia = new Scanner(System.in);
		
		double num1;
		double num2;
		String operador;
		
		System.out.println("digite a operação: ");{
			num1 = leia.nextDouble();
		}
		System.out.println("Operador");{
			operador = leia.next();
		}
		System.out.println("Digite numero: ");{
			num2 = leia.nextDouble();
		}
		//Lógica
		double resultado = "+".equals(operador) ? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 - num2 : resultado;
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, resultado);
		
		leia.close();
	}

}
