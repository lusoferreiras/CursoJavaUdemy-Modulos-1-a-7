
public class DesafioLogicos {
// Dois trabalhos podem ou nao ser confirmados
	// na quinta e na terca
	// caso ou dois trabalho deram certo tv 50"
	// caso dois trabalhos derem certo tv 32""
	// se tv comprada sorvete no shopping
	// se nao comprar vc, sem tv em casa e sem sorvete
	// mais saudavel com sorvete
	//fome sem sorvete
	public static void main(String[] args) { 
		// Trabalho na ter�a ( V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comproutv50 = trabalho1 && trabalho2;
		boolean comproutv32 = trabalho1 ^ trabalho2;
		boolean comprousorvete = trabalho1 || trabalho2;
		
		System.out.println("\nComprou tv 50\"" +comproutv50);
		System.out.println("\nComprou tv 32\"" +comproutv32);
		System.out.println("\nComprou sorvete? " + comprousorvete);
		
		//Operador Un�rio!
		System.out.println("\nMais Saudavel? " +!comprousorvete);
		System.out.println("\nCom fome! " +!comprousorvete);
		System.out.println("\nAlimentados? " +comprousorvete);
		
}
}
