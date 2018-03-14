import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class MyLabelHeure extends JLabel implements IObserver{

	Temps obs;
	MyLabelHeure(Temps obs){
		super();
		this.obs=obs;
		this.setFont(new Font("Calibri",25,250));
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		obs.add(this);
		this.setText("00");
	}
	
	@Override
	public void update() {
		
		this.setText(String.valueOf(obs.getHeure()));
		this.repaint();
		this.revalidate();
	}

}
