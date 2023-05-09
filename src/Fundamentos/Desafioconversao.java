package Fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Desafioconversao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String salario1 = JOptionPane.showInputDialog(
				"Digite primeiro salario: ");
		String salario2 = JOptionPane.showInputDialog(
				"Digite segundo salário: ");
		String salario3 = JOptionPane.showInputDialog(
				"Digite terceiro salário: ");
		
		 double valor1 = Double.parseDouble(salario1);
		 double valor2 = Double.parseDouble(salario2);
		 double valor3 = Double.parseDouble(salario3);
		 
		 double media = valor1+valor2+valor3/3;
		 
		 JOptionPane.showInputDialog("Média salarial: "+media);
	}	
}