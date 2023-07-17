package OO.heranca.desafio;

public class Ferrari extends Carro {

	public Ferrari() {
		this(315);
	}

	public Ferrari(int veloxidadeMaxima) {
		super(veloxidadeMaxima);
		delta = 15;
	}

//	@Override
//	public void acelerar() {
//		super.acelerar();
//	}
}
