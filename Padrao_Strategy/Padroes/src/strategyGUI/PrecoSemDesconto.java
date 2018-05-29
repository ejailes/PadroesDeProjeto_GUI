package strategyGUI;

public class PrecoSemDesconto implements Preco{

	@Override
	public double desconto(double valor) {
		return valor;
	}

	@Override
	public double getDesconto() {
		return 0;
	}

}
