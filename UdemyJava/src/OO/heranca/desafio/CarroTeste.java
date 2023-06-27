package OO.heranca.desafio;

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
