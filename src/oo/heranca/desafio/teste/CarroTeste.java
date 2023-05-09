package oo.heranca.desafio.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro civic = new Civic();
		civic.acelerar();
		System.out.println("Civic "+civic);
		civic.acelerar();
		System.out.println("Civic "+civic);
		civic.acelerar();
		System.out.println("Civic "+civic);
		civic.acelerar();
		civic.frear();
		
		Ferrari ferrari = new Ferrari(400);
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.ligarAr();
		System.out.println("Ferrari "+ferrari);
		System.out.println(ferrari.velocidadeDoAr());
		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.frear();
		System.out.println("Ferrari "+ferrari);
		ferrari.acelerar();
		ferrari.desligarAr();
		ferrari.frear();
		
		System.out.println(civic);
		System.out.println(ferrari);
	}

}
