package Fundamentos;

import java.util.Scanner;

public class imc {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		String nome;
		double peso;
		double altura;
		
		System.out.println("Nome do usuário: ");{
			nome = leia.next();
		}
		
		System.out.println("\nPeso: ");
		peso = leia.nextDouble();
		
		System.out.println("\nAltura: ");
		altura = leia.nextDouble();
	
		double imc = peso/(altura * altura);
		
		System.out.println("O IMC é: "+imc);
		{
			if (imc <18.5) {
				System.out.println("Abaixo do peso");
			} if (imc>=18.5&&imc<=24.9) {
				System.out.println("\nPeso normal");
			} if (imc>25&&imc<=29.9) {
				System.out.println("\nSobrepeso");
			} if (imc>=30&&imc<=34.9) {
				System.out.println("\nObesidade grau I");
			} if (imc>=35&&imc>=39.9) {
				System.out.println("\nObesidade grau II");
			} if (imc >=40) {
				System.out.println("\nObesidade grau III");
			}
		}
		leia.close();

	}

}
