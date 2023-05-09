package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Quantos alunos? ");
		int  qtdeAlunos = read.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int qtdeNotas = read.nextInt();
		
		double [] [] notasDaTurma = new double [qtdeAlunos] [qtdeNotas];
		
		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
				notasDaTurma[a][n] = read.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("Média da turma é de "+media);
		
		for (double[] notasAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasAluno));
		}
		
		read.close();

	}

}
