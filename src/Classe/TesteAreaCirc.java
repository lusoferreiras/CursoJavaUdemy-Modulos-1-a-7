package Classe;

public class TesteAreaCirc {

	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10;
		//a1.pi = 10;
		
		
		AreaCirc a2 = new AreaCirc(5);
		
		//a2.pi = 5;
		
		
		System.out.println(a1.area());
		System.out.println(a2.area());

	}

}