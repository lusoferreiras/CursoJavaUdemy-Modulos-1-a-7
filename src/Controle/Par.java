package Controle;


import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite numero: ");{
			numero = leia.nextInt();
			
			
		}if (numero >=0 && numero <=10){
			System.out.println("Está dentro do padrão");
			
		}else {
			System.out.println("\nO número não está dentro do padrão");
		}
		if (numero %2 == 0) {
			System.out.println("\nO numero é par!");
		}
		else if (numero %2 == 1) {
			System.out.println("\no número não é par");
		} 
		 
		leia.close();
		


	}

}
