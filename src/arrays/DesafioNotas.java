package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioNotas {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		double [] notasdesafio = new double [5];
		
		for (int i = 0; i < notasdesafio.length; i++) {
			System.out.println("Digite as notas do desafio: ");
			if(notasdesafio.length<=10&&notasdesafio.length>0) {
				notasdesafio[i] =+ read.nextDouble();
				System.out.println(Arrays.toString(notasdesafio));
			}
		}
		
		double soma = 0;
		
		for (int i = 0; i < notasdesafio.length; i++) {
			soma += notasdesafio[i];
		}
		double resultado = soma/notasdesafio.length;
		System.out.println("Resultado das notas: "+soma+ " \ne sua média é de: "+resultado);
		
		

	}

}
