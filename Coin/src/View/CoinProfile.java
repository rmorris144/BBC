package View;

import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CoinProfile extends JPanel {
	
	private JButton b;
	private JPanel p;
	private JLabel l;
	private JTextField t;
	private CoinOverview co;
	
	public CoinProfile() {

	l = new JLabel("Add Pence"); 
	
	t = new JTextField(6);
	t.setEditable(true);
	t.setToolTipText("Add your coins here");
	b = new JButton("Calculate");
	this.add(b);
	
	p = new JPanel();
	Box buttonm = Box.createVerticalBox();
	p.add(l);
	p.add(t);
	p.add(b);
	buttonm.add(p);

	
	this.add(buttonm);
	
}
	
	public void addCalculateBoxListener(ActionListener al) {
		b.addActionListener(al);
	}
}
