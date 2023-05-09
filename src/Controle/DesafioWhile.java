package Controle;
/*calcular media de uma turma, digitar nota valida10 a 0, 
 * armazena nota em total, toda nova nota sera amazenada em total
 * total soma todas as notas, contar as notas validas.
 * digitar -1 para sair do programa, e calcula a média
 * 
 */
import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int qtdDenotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota !=666) {
			System.out.println("digite uma nota: ");
			nota = leia.nextDouble();
			if (nota<=10 && nota>=0) {
				total += nota;
				qtdDenotas++;
			}else if ( nota !=666) {
				System.out.println("Nota Inválida!");
			}
			
		}
		//Calcular média
		double media = total/qtdDenotas;
		System.out.println("Média: "+media);
		
		leia.close();

	}

}
