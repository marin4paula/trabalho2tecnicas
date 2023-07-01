package view.trabalho2;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.JButton;

public class Painelaeb extends JPanel {
	public Painelaeb() {
		setPreferredSize(new Dimension(230, 100));
		setBackground(new Color(171, 179, 242));
		setLayout(new GridLayout(3, 6));
		JLabel pontuacao = new JLabel("pontuaçao: ");
		ImageIcon Bugs = new ImageIcon("desenhos/rei.png");
		Bugs.setImage(Bugs.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH));
		JLabel bug = new JLabel(Bugs);
		JLabel bugss = new JLabel("bugs: ");
		JLabel numerob = new JLabel("7");

		ImageIcon Alunos = new ImageIcon("desenhos/luz.png");
		Alunos.setImage(Alunos.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		JLabel alunos = new JLabel(Alunos);
		JLabel alunoss = new JLabel("alunos: ");
		JLabel numeroa = new JLabel("5");

		ImageIcon Bispo = new ImageIcon("desenhos/gato.png");
		Bispo.setImage(Bispo.getImage().getScaledInstance(50, 100, Image.SCALE_SMOOTH));
		JLabel bispo = new JLabel(Bispo);

		ImageIcon Andador = new ImageIcon("desenhos/bean.png");
		Andador.setImage(Andador.getImage().getScaledInstance(50, 100, Image.SCALE_SMOOTH));
		JLabel andador = new JLabel(Andador);

		ImageIcon Cavalo = new ImageIcon("desenhos/Flapjack.png");
		Cavalo.setImage(Cavalo.getImage().getScaledInstance(50, 100, Image.SCALE_SMOOTH));
		JLabel cavalo = new JLabel(Cavalo);

		JButton gata = new JButton();
		gata.setIcon(Bispo);
		JButton flap = new JButton();
		flap.setIcon(Cavalo);
		JButton bean = new JButton();
		bean.setIcon(Andador);

		JLabel nulo = new JLabel(": ");
		JLabel espaco = new JLabel(": ");
		JLabel nada = new JLabel(": ");
		JLabel nada1 = new JLabel();
		JLabel nada2 = new JLabel();
		JLabel nada3 = new JLabel();

		add(bug);
		add(bugss);
		add(numerob);
		add(alunos);
		add(alunoss);
		add(numeroa);
		add(bispo);
		add(nulo);
		add(andador);
		add(espaco);
		add(cavalo);
		add(nada);
		add(gata);
		add(nada1);
		add(bean);
		add(nada2);
		add(flap);
		add(nada3);
	}

}
