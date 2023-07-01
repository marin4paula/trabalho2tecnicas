package model.trabalho2;

import javax.swing.JButton;

public class Celula {
	private int id;
	private JButton button;

	public Celula(int id) {
		this.id = id;
		this.button = new JButton();
	}

	public JButton getButton() {
		return button;
	}
}
