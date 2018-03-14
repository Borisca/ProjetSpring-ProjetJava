import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BoutonListener implements ActionListener {

	private Utilisateur user;
	private Controller control;
	private JLabel affichage;

	BoutonListener(Utilisateur user, Controller control, JLabel affichage) {
		this.user = user;
		this.control = control;
		this.affichage = affichage;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton temp = (JButton) arg0.getSource();
		int index = 0;
		String[] nomUtilisateur;
		String nomUser2;
		Double montant;
		if (temp.getText().contains("Historique")) {
			affichage.setText(user.getConseiller().afficherHistorique(user));
			System.out.println(user.getConseiller().getBank().getTaxeBancaire());
		}

		if (temp.getText().contains("Virement")) {
			montant = Double
					.parseDouble(JOptionPane.showInputDialog(null, "Entrer le montant a virer", "Montant à virer"));
			nomUtilisateur = new String[control.getFen().getListUtilisateur().size()];
			for (int i = 0; i < control.getFen().getListUtilisateur().size(); i++) {
				nomUtilisateur[i] = control.getFen().getListUtilisateur().get(i).toString();
			}
			nomUser2 = (String) JOptionPane.showInputDialog(null, "Choisir a qui donner l'argent",
					"Receveur?", JOptionPane.QUESTION_MESSAGE, null, nomUtilisateur, nomUtilisateur[0]);
			for (int i = 0; i < control.getFen().getListUtilisateur().size(); i++) {
				if (control.getFen().getListUtilisateur().get(i).toString().equals(nomUser2))
					index = i;
			}
			user.getConseiller().virementUser1ToUser2(user, control.getFen().getListUtilisateur().get(index), montant);

		}

		if (temp.getText().contains("Ajouter")) {
			montant = Double
					.parseDouble(JOptionPane.showInputDialog(null, "Entrer le montant a ajouter", "Montant à ajouter"));
			user.getConseiller().ajouterArgent(user, montant);
		}

		if (temp.getText().contains("Retirer")) {
			montant = Double
					.parseDouble(JOptionPane.showInputDialog(null, "Entrer le montant a retirer", "Montant à retirer"));
			user.getConseiller().retirerArgent(user, montant);
		}

	}

}
