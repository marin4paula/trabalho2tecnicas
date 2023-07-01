package view.trabalho2;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuSuperior extends JPanel {
	public MenuSuperior() {
		this.setBackground(new Color(171, 179, 242));
		setLayout(new FlowLayout());
		JLabel nome = new JLabel("nome do jogador");
		JTextField jogador = new JTextField(25);
		BotaoJogar jogar = new BotaoJogar();
		BotaoRelatorio relatorio = new BotaoRelatorio();
		add(nome);
		add(jogador);
		add(jogar);
		add(relatorio);

	}
}
