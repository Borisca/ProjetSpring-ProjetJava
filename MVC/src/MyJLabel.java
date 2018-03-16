import javax.swing.JLabel;

public class MyJLabel extends JLabel implements IObserver {




	public MyJLabel() {
		super();

	}
	public MyJLabel(String str) {
		super(str);

	}

	public void addModel(Modele model) {
		model.add(this);

	}
	@Override
	public void update(String str) {
		this.setText(str);
	}

	

}
