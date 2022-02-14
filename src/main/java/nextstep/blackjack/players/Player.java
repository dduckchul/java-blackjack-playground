package nextstep.blackjack.players;

public class Player extends Gamer {

	private String name;

	public Player(String name){
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
