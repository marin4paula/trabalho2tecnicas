package view.trabalho2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

import model.trabalho2.Celula;

public class PainelTabuleiro extends JPanel {
	public PainelTabuleiro() {
		this.setLayout(new GridLayout(8, 8));
		setPreferredSize(new Dimension(560, 560));
		criarbotoes();
	}

	public void criarbotoes() {
		int id = 1;
		for (int linha = 1; linha <= 8; linha++) {
			for (int coluna = 1; coluna <= 8; coluna++) {
				Celula celula = new Celula(id);
				id++;
				celula.getButton().setPreferredSize(new Dimension(50, 50));
				celula.getButton().setBorderPainted(false);
				if ((linha + coluna) % 2 == 0) {
					celula.getButton().setBackground(new Color(36, 27, 83));
				}

				else {
					celula.getButton().setBackground(new Color(99, 78, 166));
				}
				add(celula.getButton());
			}
		}
	}
}
