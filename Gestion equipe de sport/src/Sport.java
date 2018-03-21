import java.util.List;

public enum Sport {

	FOOTBALL("FootBall"), BASKETBALL("BasketBall"),HANDBALL("HandBall"),BASEBALL("BaseBall");

	final String name;
	List<Equipe> listEquipe;

	private Sport(String name) {
		this.name = name;
	}
	
	public void addEquipe(Equipe equipe) {
		this.listEquipe.add(equipe);
	}
}
