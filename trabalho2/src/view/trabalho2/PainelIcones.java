package view.trabalho2;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class PainelIcones extends JPanel {
	public PainelIcones() {
		setPreferredSize(new Dimension(160, 110));
		setBackground(new Color(171, 179, 242));

		ImageIcon logo = new ImageIcon("desenhos/logoremove.png");
		logo.setImage(logo.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH));
		JLabel logoSuperior = new JLabel(logo);

		add(logoSuperior);

	}
}
