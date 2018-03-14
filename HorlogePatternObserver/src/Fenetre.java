import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{

	JPanel pan = new JPanel();
	Temps temps;
	
	
	
	
	Fenetre(){
		temps=new Temps();
		MyLabelHeure heureLabel=new MyLabelHeure(temps);
		MyLabelMinute minuteLabel=new MyLabelMinute(temps);
		MyLabelSeconde secondeLabel=new MyLabelSeconde(temps);
		this.setVisible(true);
		this.setSize(1400, 780);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(1,3));
		pan.add(heureLabel);
		pan.add(minuteLabel);
		pan.add(secondeLabel);		
		this.add(pan);
		temps.lancementThread();
	}



	
}
