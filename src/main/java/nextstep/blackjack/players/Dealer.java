package nextstep.blackjack.players;

import static nextstep.blackjack.util.PlayerUtil.*;

public class Dealer extends Gamer {

	public Dealer(){
		super();
	}

	@Override
	public String getName() {
		return DEALER_NAME;
	}
}
