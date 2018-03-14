import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuListener implements ActionListener {

	private Controller controller;

	MenuListener(Controller controller) {
		this.controller = controller;
	}

	public void actionPerformed(ActionEvent arg0) {
		JMenuItem a = (JMenuItem) arg0.getSource();
		String nom, prenom;
		String[] nomBanque;
		String[]nomConseiller;
		
		
		if (a.getText().contains("Utilisateur")) {
			if (controller.getFen().getListConseiller().size() == 0)
				System.err.println("Il n'y a pas de conseiller a lié à un nouvel utilisateur");
			else {
				int index=0;
				nom = JOptionPane.showInputDialog(null, "Entrer le nom du client", "Nom du client");
				prenom = JOptionPane.showInputDialog(null, "Entrer le prenom du client", "Prenom du client");
				nomConseiller = new String[controller.getFen().getListConseiller().size()];
				for (int i = 0; i < controller.getFen().getListConseiller().size(); i++) {
					nomConseiller[i] = controller.getFen().getListConseiller().get(i).toString();
				}

				String input = (String) JOptionPane.showInputDialog(null, "Choisir l'utilsateur a lié à ce conseiller",
						"Quel conseiller?", JOptionPane.QUESTION_MESSAGE, null, nomConseiller, nomConseiller[0]);
				for (int i = 0; i < nomConseiller.length; i++) {
					if (input.equals(nomConseiller[i].toString()))
						index=i;
				}
				controller.getFen().addOngletUtilisateur(new Utilisateur(nom, prenom, controller.getFen().getListConseiller().get(index)));
			}
		}

		// AJOUT CONSEILLER BOUTON
		if (a.getText().contains("conseiller")) {
			if (controller.getFen().getListBanque().size() == 0)
				System.err.println("Il n'y a pas de banque a lié à un nouveau conseiller");
			else {
				int index=0;
				nom = JOptionPane.showInputDialog(null, "Entrer le nom du conseiller", "Nom du conseiller");
				prenom = JOptionPane.showInputDialog(null, "Entrer le prenom du conseiller", "Prenom du conseiller");
				
				nomBanque = new String[controller.getFen().getListBanque().size()];
				
				for (int i = 0; i < controller.getFen().getListBanque().size(); i++) {
					nomBanque[i] = controller.getFen().getListBanque().get(i).toString();
				}

				String input = (String) JOptionPane.showInputDialog(null, "Choisir la banque a lié à ce conseiller",
						"Quel banque?", JOptionPane.QUESTION_MESSAGE, null, nomBanque, nomBanque[0]);
				
				for (int i = 0; i < nomBanque.length; i++) {
					if (input.equals(nomBanque[i].toString()))
						index=i;
				}
				controller.getFen().addOngletConseiller(new Conseiller(nom, prenom, controller.getFen().getListBanque().get(index)));
			}
		}

		// AJOUT BANQUE
		if (a.getText().contains("Banque")) {

			nom = JOptionPane.showInputDialog(null, "Entrer le nom de la banque", "Nom de Banque");
			String pays = JOptionPane.showInputDialog(null, "Entrer le pays de la banque", "Pays Banque");
			controller.getFen().addOngletBank(new Bank(nom, pays));
		}
	}

}
