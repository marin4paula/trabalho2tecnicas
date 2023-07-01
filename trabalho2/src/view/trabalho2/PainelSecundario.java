package view.trabalho2;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class PainelSecundario extends JPanel {
	public PainelSecundario() {
		setBackground(new Color(171, 179, 242));
		JPanel menuescolhas = new JPanel();
		menuescolhas.setLayout(new GridLayout(3, 1));
		BotaoVerificar verificar = new BotaoVerificar();
		BotaoProxima proxima = new BotaoProxima();
		BotaoSair sair = new BotaoSair();
		menuescolhas.add(verificar);
		menuescolhas.add(proxima);
		menuescolhas.add(sair);
		add(menuescolhas);
	}
}
