package Fundamentos;


public class conversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a =1; // implicita
		System.out.println(a);
		
		float b =  (float) 1.12456788888; // explicita [CAST]
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // explicita (CAST)
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f);
	}
	

}
