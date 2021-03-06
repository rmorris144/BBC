package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Coin;
import View.CoinFrame;
import View.CoinOverview;
import View.CoinProfile;

public class CoinController {
	
	private CoinFrame view;
	private Coin model;
	private CoinProfile cp;
	private CoinOverview co;
	
	
	
	public CoinController(CoinFrame view, Coin model) {
		cp.addCalculateBoxListener(new CalculateButtonHandler());
		
		
	}
	
	private class CalculateButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			co.updateText(model.getCoin());
//			co.updateText().getText();
		}
	}

}
