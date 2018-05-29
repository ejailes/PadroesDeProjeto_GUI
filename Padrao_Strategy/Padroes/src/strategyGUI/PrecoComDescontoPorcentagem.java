package strategyGUI;

public class PrecoComDescontoPorcentagem implements Preco{

	private int porcentagemDesconto;
	private double desconto;
	
	public PrecoComDescontoPorcentagem(int porcentagemDesconto){
		this.porcentagemDesconto = porcentagemDesconto;
	}
	
	@Override
	public double desconto(double valor) {
		this.desconto = (valor * this.porcentagemDesconto) / 100;
		return valor - this.desconto;
	}

	@Override
	public double getDesconto() {
		return this.desconto;
	}

}
