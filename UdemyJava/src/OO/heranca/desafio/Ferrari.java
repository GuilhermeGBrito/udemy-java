package OO.heranca.desafio;

public class Ferrari extends Carro {

	Ferrari() {
		this(315);
	}

	Ferrari(int veloxidadeMaxima) {
		super(veloxidadeMaxima);
		delta = 15;
	}

//	@Override
//	void acelerar() {
//		super.acelerar();
//	}
}
