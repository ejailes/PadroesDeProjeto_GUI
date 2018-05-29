package strategyGUI;

public class OrdemDeCompra {

	private double valor;
	private Preco p = new PrecoSemDesconto();
	private String produto;

	public OrdemDeCompra(String produto, double valor, Preco p) {
		this.p = p;
		this.valor = valor;
		this.produto = produto;
	}

	public void comprarProduto() {
		System.out
				.printf("Compra %s realizada com sucesso!!.\nValor total R$ %f.\nValor final %f, com desconto de R$ %f",
						this.produto, this.valor, this.p.desconto(this.valor),
						this.p.getDesconto());
	}
}
