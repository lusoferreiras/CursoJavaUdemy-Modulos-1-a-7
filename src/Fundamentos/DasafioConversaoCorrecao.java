package Fundamentos;

import java.util.Scanner;

public class DasafioConversaoCorrecao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o sal�rio: ");
		String valor1 = leia.next().replace(",", ".");

		System.out.println("Informe o sal�rio: ");
		String valor2 = leia.next().replace(",", ".");

		System.out.println("Informe o sal�rio: ");
		String valor3 = leia.next().replace(",", ".");

		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);

		double media = (salario1 + salario2 + salario3) / 3;

		System.out.println("A m�dia dos sal�rios �: " + media);

		leia.close();

	}

}
