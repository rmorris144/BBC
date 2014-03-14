package View;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import Controller.CoinController;

public class CoinFrame extends JFrame {
	
	private JPanel p;
	private CoinOverview co;
	private CoinProfile cp;
	
	public CoinFrame() {
		
		this.setTitle("BBC_Coin_Algorithm"); //set the title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cp = new CoinProfile();
	
		
		JTabbedPane tabpane = new JTabbedPane(JTabbedPane.TOP);
		tabpane.setPreferredSize(new Dimension(300, 200));
		this.add(tabpane);
		
		co = new CoinOverview();
		tabpane.add("CoinProfile", cp);
		tabpane.add("Overview", co);
		
		
	
		
		this.setPreferredSize(new Dimension(500, 500));
		this.pack();
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		CoinFrame view = new CoinFrame();
		CoinController controller = new CoinController(view, null); //model);
	}
}
