package Fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 8.6;
		String resultadoFinal = media >= 7.0 ? 
				"aprovado." : "em recupera��o.";
		System.out.println("O aluno est� "+resultadoFinal);
		
		double nota  = 9.9;
		boolean bomComportamento = true;
		boolean passouPormedia =  nota >= 7;
		boolean temDesconto = bomComportamento && passouPormedia;
		String resultado = temDesconto ? "Sim" : "N�o";
		
		System.out.println("\nTem desconto? " +resultado);

	}

}
