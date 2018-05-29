package strategyGUI;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Janela extends JFrame implements ActionListener {

	JButton calcular;
	JTextField produto, valor;
	JRadioButton semDesconto, descontoPorcentagem, descontoReal;
	ButtonGroup grupoDeRadios;

	public Janela() {

		super("Calcula de Desconto");

		// Containers
		Container ct = super.getContentPane();
		ct.setLayout(new GridLayout(8, 1));

		// JTextFields
		this.produto = new JTextField();
		this.valor = new JTextField();

		// JRadioButtons
		this.semDesconto = new JRadioButton();
		this.semDesconto.setText("Sem Desconto");
		this.semDesconto.addActionListener(new RadioButtonListener(valor, produto));

		this.descontoPorcentagem = new JRadioButton();
		this.descontoPorcentagem.setText("Desconto Porcentagem");
		this.descontoPorcentagem.addActionListener(new RadioButtonListener(valor, produto));

		this.descontoReal = new JRadioButton();
		this.descontoReal.setText("Desconto Real");
		this.descontoReal.addActionListener(new RadioButtonListener(valor, produto));

		// Grupo Buttons
		this.grupoDeRadios = new ButtonGroup();
		this.grupoDeRadios.add(semDesconto);
		this.grupoDeRadios.add(descontoPorcentagem);
		this.grupoDeRadios.add(descontoReal);

		// JButton
		calcular = new JButton("Calcular Preço");
		calcular.addActionListener(this);

		ct.add(new JLabel("Produto: "));
		ct.add(produto);
		ct.add(new JLabel("Valor: "));
		ct.add(valor);
		ct.add(semDesconto);
		ct.add(descontoReal);
		ct.add(descontoPorcentagem);
		ct.add(calcular);

		super.setVisible(true);
		super.setSize(350, 300);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new Janela();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.calcular) {
			this.checkDesconto();
		}

	}

	private void checkDesconto() {

		if (descontoPorcentagem.isSelected()) {
			JOptionPane.showMessageDialog(null, RadioButtonListener.RESULT);
		}

		if (descontoReal.isSelected()) {
			JOptionPane.showMessageDialog(null, RadioButtonListener.RESULT);
		}

		if (semDesconto.isSelected()) {
			JOptionPane.showMessageDialog(null, RadioButtonListener.RESULT);
		}

	}

}
