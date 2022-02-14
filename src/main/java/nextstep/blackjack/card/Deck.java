package nextstep.blackjack.card;

import java.util.List;
import java.util.Stack;

public class Deck {
	private Stack<PlayingCard> deck;

	public Deck(List<PlayingCard> cards){
		this.deck = new Stack<>();
		deck.addAll(cards);
	}

	public Stack<PlayingCard> getDeck() {
		return deck;
	}

	public PlayingCard drawCard(){
		return deck.pop();
	}
}
