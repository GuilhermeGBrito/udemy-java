package OO.heranca.teste;

import OO.heranca.desafio.Carro;
import OO.heranca.desafio.Civic;
import OO.heranca.desafio.Ferrari;

public class CarroTeste {
	public static void main(String[] args) {

		Carro c1 = new Civic();
		c1.acelerar();
		System.out.println("CIVIC " + c1);

		Ferrari c2 = new Ferrari(400);
		c2.acelerar();
		System.out.println("FERRARI " + c2);

	}

}
