package strategyGUI;

public class PrecoComDescontoReal implements Preco {

	private double valorDesconto;

	public PrecoComDescontoReal(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public double getDesconto() {
		return this.valorDesconto;
	}

	@Override
	public double desconto(double valor) {
		return valor - this.valorDesconto;
	}

}
