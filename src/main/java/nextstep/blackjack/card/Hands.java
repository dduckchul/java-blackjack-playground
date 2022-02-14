package nextstep.blackjack.card;

import java.util.ArrayList;
import java.util.List;

public class Hands {

	List<PlayingCard> cards = new ArrayList<>();

	public List<PlayingCard> getCards() {
		return cards;
	}

	public void addCard(PlayingCard card){
		cards.add(card);
	}
}
