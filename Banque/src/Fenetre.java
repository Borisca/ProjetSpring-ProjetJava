import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class Fenetre extends JFrame {

	private int position=0;
	JLabel historique = new JLabel();
	JMenuBar menu = new JMenuBar();
	JMenu fichier = new JMenu("Fichier");
	JMenuItem user = new JMenuItem("Nouvel Utilisateur");
	JMenuItem conseiller = new JMenuItem("Nouveau conseiller");
	JMenuItem bank = new JMenuItem("Nouvelle Banque");
	ActionListener menuListener;
	ActionListener boutonListener;
	Controller control;
	List <JSplitPane>panneauUser=new ArrayList<>();
	JTabbedPane ongletUtilisateur=new JTabbedPane();
	
	List<Bank>listBanque=new ArrayList<>();
	List<Conseiller>listConseiller=new ArrayList<>();
	List <Utilisateur>listUtilisateur=new ArrayList<>();

	Fenetre(MenuListener menuListener, Controller controller) {
		this.setVisible(true);
		this.setSize(1024, 768);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.menuListener = menuListener;
		this.control = controller;
		setJMenuBar();
	}

	private void setJMenuBar() {
		user.addActionListener(menuListener);
		conseiller.addActionListener(menuListener);
		bank.addActionListener(menuListener);
		menu.add(fichier);
		fichier.add(user);
		fichier.add(conseiller);
		fichier.add(bank);
		this.setJMenuBar(menu);

	}

	public void addOngletBank(Bank bank) {

		listBanque.add(bank);

	}

	public void addOngletConseiller(Conseiller conseiller) {
		
		listConseiller.add(conseiller);

	}

	public void addOngletUtilisateur(Utilisateur user) {
		listUtilisateur.add(user);
		JPanel temp=new JPanel();
		JPanel temp2=new JPanel();
		JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, temp,temp2);
		JButton afficherHistorique=new JButton("Afficher Historique");
		JButton virement = new JButton("Virement");
		JButton ajouterArgent=new JButton("Ajouter Argent");
		JButton retirerArgent=new JButton("Retirer Argent");
		JLabel affichage=new JLabel();
		ActionListener boutonListener=new BoutonListener(user,control,affichage);	
		afficherHistorique.addActionListener(boutonListener);
		virement.addActionListener(boutonListener);
		ajouterArgent.addActionListener(boutonListener);
		retirerArgent.addActionListener(boutonListener);
		split.setEnabled(false);
		split.setDividerLocation(100);
		temp.setLayout(new GridLayout(3,2));
		JLabel banque=new JLabel("Banque : "+user.getConseiller().getBank().getNom());
		banque.setFont(new Font("Calibri", 25, 40));
		JLabel conseiller=new JLabel("Conseiller : "+user.getConseiller().getNom());
		conseiller.setFont(new Font("Calibri", 25, 40));
		affichage.setFont(new Font("Calibri", 25, 40));
		panneauUser.add(split);
		temp.add(banque);
		temp.add(conseiller);
		temp.add(afficherHistorique);
		temp.add(virement);
		temp.add(ajouterArgent);
		temp.add(retirerArgent);
		temp2.add(affichage);
		
		ongletUtilisateur.add(user.getNom(),panneauUser.get(position));
		this.add(ongletUtilisateur);
		this.repaint();
		this.revalidate();
		position++;
	}


	public List<Bank> getListBanque() {
		return listBanque;
	}

	public void setListBanque(List<Bank> listBanque) {
		this.listBanque = listBanque;
	}

	public List<Conseiller> getListConseiller() {
		return listConseiller;
	}

	public void setListConseiller(List<Conseiller> listConseiller) {
		this.listConseiller = listConseiller;
	}

	public List<Utilisateur> getListUtilisateur() {
		return listUtilisateur;
	}

	public void setListUtilisateur(List<Utilisateur> listUtilisateur) {
		this.listUtilisateur = listUtilisateur;
	}

	
}
