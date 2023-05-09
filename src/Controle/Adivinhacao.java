package Controle;

import java.util.Scanner;

public class Adivinhacao {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.println("Digite um número: ");
		{
			numero = leia.nextInt();
		}
		if (numero == 14 && numero >= 0 && numero <= 100) {
			System.out.println("número certo");
		} else {
			System.out.println("Tente novamente!" + "Você tem mais 9 chances");
		}
		System.out.println("Digite um número: ");
		{
			numero = leia.nextInt();
		}
		if (numero == 14 && numero >= 0 && numero <= 100) {
			System.out.println("número certo");
		} else {
			System.out.println("Tente novamente!" + "Você tem mais 8 chances");
		}
		System.out.println("Digite um número: ");
		{
			numero = leia.nextInt();
		}
		System.out.println("Digite um número: ");
		{
			numero = leia.nextInt();
		}
		if (numero == 14 && numero >= 0 && numero <= 100) {
			System.out.println("número certo");
		} else {
			System.out.println("Tente novamente!" + "Você tem mais 7 chances");
		}
		System.out.println("Digite um número: ");
		{
			numero = leia.nextInt();
		}
		
		if (numero == 14 && numero >= 0 && numero <= 100) {
			System.out.println("número certo");
		} else {
			System.out.println("Tente novamente!" + "Você tem mais 6 chances");
		}
		System.out.println("Digite um número: ");
		{
			numero = leia.nextInt();
		}
		
		if (numero == 14 && numero >= 0 && numero <= 100) {
			System.out.println("número certo");
		} else {
			System.out.println("Tente novamente!" + "Você tem mais 5 chances");
		}
		System.out.println("Digite um número: ");
		{
			numero = leia.nextInt();
		}
		
		if (numero == 14 && numero >= 0 && numero <= 100) {
			System.out.println("número certo");
		} else {
			System.out.println("Tente novamente!" + "Você tem mais 4 chances");
		}
		System.out.println("Digite um número: ");
		{
			numero = leia.nextInt();
		}
		if (numero == 14 && numero >= 0 && numero <= 100) {
			System.out.println("número certo");
		} else {
			System.out.println("Tente novamente!" + "Você tem mais 3 chances");
		}
		System.out.println("Digite um número: ");
		{
			numero = leia.nextInt();
		}
	
		if (numero == 14 && numero >= 0 && numero <= 100) {
			System.out.println("número certo");
		} else {
			System.out.println("Tente novamente!" + "Você tem mais 2 chances");
		}
		System.out.println("Digite um número: ");
		{
			numero = leia.nextInt();
		}
		if (numero == 14 && numero >= 0 && numero <= 100) {
			System.out.println("número certo");
		} else {
			System.out.println("Tente novamente!" + "Você tem mais 1 chance");
		}
		System.out.println("Digite um número: ");
		{
			numero = leia.nextInt();
		}
		
		if (numero != 14) {
			System.out.println("\nTente novamente!" + "Não acertou");
		}
	}

}
