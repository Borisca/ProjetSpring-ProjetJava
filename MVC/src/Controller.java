import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Controller implements ActionListener{

	Modele model;
	JTextField texte;

	Controller(Modele model, JTextField texte){
		this.model=model;
		this.texte=texte;

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		model.setTexte(texte.getText());
		
	}
	public Modele getModel() {
		return model;
	}
	public void setModel(Modele model) {
		this.model = model;
	}
	public JTextField getTexte() {
		return texte;
	}
	public void setTexte(JTextField texte) {
		this.texte = texte;
	}

	

}
