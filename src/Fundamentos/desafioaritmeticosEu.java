package Fundamentos;

public class desafioaritmeticosEu {

	public static void main(String[] args) {
		
		double a = (6 * (2+3));
		double b = ((1-5) * (2-7));
		double c = 3*2;
		double d = 2;
		double e =  Math.pow(a, 2);
		double f = Math.pow((b/d), 2);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		double a2 = e/c;
		double b2 = f;
		
		System.out.println(a2);
		System.out.println(b2);
		
		double a3 = Math.pow(a2 - b2, 3);
		double b3 = Math.pow(10, 3);
		
		System.out.println(a3);
		System.out.println(b3);
		
		double a4 = a3/b3;
		
		System.out.println(a4);
		
		

	}

}
