package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Infoma��es do funcion�rio
		
		// Tipos num�ricos inteiros
		byte anosdeEmpresa =23;
		short numerodeVoos = 532;
		int id = 56789;
		long pontosAcumulados = 1_134_845_223L;
		
		//Tipos num�ricos reias
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		boolean estadeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; // ativo
		
		//Dias de empresa 
		System.out.println(anosdeEmpresa);
		
		// N�meros de voos
		System.out.println(numerodeVoos);
		
		// Pontos por real
		System.out.println(pontosAcumulados);
		
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("F�rias? "+estadeFerias);
		System.out.println("Status: " +status);

	}

}
