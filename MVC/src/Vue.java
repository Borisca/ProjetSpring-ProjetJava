import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Vue extends JFrame {

	JButton bouton;
	JTextField txt;
	MyJLabel []label=new MyJLabel[5];
	String []nom= {"1","2","3","4","5" };

	Vue(){

		initVue();
		
		
	}

	private void initVue() {
		
		bouton=new JButton("OK");
		bouton.setPreferredSize(new Dimension(250,100));
		
		txt=new JTextField();
		txt.setPreferredSize(new Dimension(250,100));
		
		for (int i = 0; i < label.length; i++) {
			label[i]=new MyJLabel(nom[i]);
			label[i].setPreferredSize(new Dimension(250,100));
			this.add(label[i]);
		}

		
		
		this.add(bouton);
		this.add(txt);
		
		this.setVisible(true);
		this.setSize(1440, 900);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		
	}

	public JButton getBouton() {
		return bouton;
	}

	public void setBouton(JButton bouton) {
		this.bouton = bouton;
	}

	public JTextField getTxt() {
		return txt;
	}

	public void setTxt(JTextField txt) {
		this.txt = txt;
	}

	public MyJLabel[] getLabel() {
		return label;
	}


	
	
}
