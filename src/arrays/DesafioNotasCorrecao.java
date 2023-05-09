package arrays;

import java.util.Scanner;

public class DesafioNotasCorrecao {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Quantas notas: ");
		
		int qtdNotas = read.nextInt();
		
		double [] notas = new double [qtdNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota "+(i + 1) + ": ");
			notas[i] = read.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.println("A média é "+ media+"!");
		read.close();

	}

}
