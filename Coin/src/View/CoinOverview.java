package View;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import Model.Coin;

public class CoinOverview extends JPanel {

	private JTextArea ar;
	private Coin c;
	
	public CoinOverview() {
		ar = new JTextArea();
		ar.setColumns(40);
		ar.setRows(20);
		this.add(ar);
	}
	
	public void updateText(int number) {
		ar.append("Print: " + c.getCoin());
	}
}
