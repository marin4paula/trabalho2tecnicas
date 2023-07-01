package view.trabalho2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame {
	public Janela() {
		setTitle("ilhas ferventes");
		setSize(900, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new BorderLayout());
		MenuSuperior menusuperior = new MenuSuperior();
		add(BorderLayout.NORTH, menusuperior);
		JPanel organizacao = new JPanel();
		organizacao.setBackground(new Color(171, 179, 242));
		PainelTabuleiro tabuleiro = new PainelTabuleiro();
		organizacao.add(tabuleiro);
		add(BorderLayout.CENTER, organizacao);
		JPanel plateral = new JPanel();
		plateral.setPreferredSize(new Dimension(280, 600));
		plateral.setLayout(new GridLayout(3, 1));
		plateral.setLayout(new BorderLayout());
		PainelSecundario psecundario = new PainelSecundario();
		psecundario.setPreferredSize(new Dimension(250, 200));
		PainelIcones icones = new PainelIcones();
		Painelaeb painelimagens = new Painelaeb();
		plateral.add(BorderLayout.NORTH, icones);
		plateral.add(BorderLayout.CENTER, painelimagens);
		plateral.add(BorderLayout.SOUTH, psecundario);
		plateral.setBackground(new Color(171, 179, 242));
		add(BorderLayout.EAST, plateral);
		setVisible(true);

	}
}
