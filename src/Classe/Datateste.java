package Classe;

public class Datateste {

	public static void main(String[] args) {
		Data dt = new Data();
		
		System.out.println(dt.obterDataFormatada());

		var dt2 = new Data(31, 12, 2020);
		

		System.out.println(dt2.obterDataFormatada());
		
		dt.imprimirDataFormatada();
	}

}
