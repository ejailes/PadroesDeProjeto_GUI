package strategyGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RadioButtonListener implements ActionListener {

	private JTextField valor, produto;
	private Preco preco;
	public static String RESULT;

	public RadioButtonListener(JTextField valor, JTextField produto) {
		this.valor = valor;
		this.produto = produto;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		case "Desconto Porcentagem":

			String descontoPorcentagem = JOptionPane
					.showInputDialog("Digite o valor do desconto em %");

				this.preco = new PrecoComDescontoPorcentagem(
						Integer.parseInt(descontoPorcentagem));

			RESULT = "Produto: "
					+ this.produto.getText()
					+ "\nValor final do produto: R$ "
					+ this.preco.desconto(Double.parseDouble(this.valor
							.getText())) + "\nValor do desconto: R$ "
					+ this.preco.getDesconto();
			break;

		case "Desconto Real":

			String descontoReal = JOptionPane
					.showInputDialog("Digite o valor do desconto em Real");
				this.preco = new PrecoComDescontoReal(
						Integer.parseInt(descontoReal));
				
				RESULT = "Produto: "
						+ this.produto.getText()
						+ "\nValor final do produto: R$ "
						+ this.preco.desconto(Double.parseDouble(this.valor
								.getText())) + "\nValor do desconto: R$ "
						+ this.preco.getDesconto();

			break;

		case "Sem Desconto":

			JOptionPane.showMessageDialog(null, "Produto sem desconto");
			this.preco = new PrecoSemDesconto();

			RESULT = "Produto: "
					+ this.produto.getText()
					+ "\nValor final do produto: R$ "
					+ this.preco.desconto(Double.parseDouble(this.valor
							.getText())) + "\nValor do desconto: R$ "
					+ this.preco.getDesconto();

			break;

		default:

			JOptionPane.showMessageDialog(null, "Error");
			RESULT = "ERROR";

			break;
		}
	}
}
