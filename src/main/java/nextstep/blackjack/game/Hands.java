package nextstep.blackjack.game;

import static nextstep.blackjack.util.BlackJackGameUtil.*;

import java.util.ArrayList;
import java.util.List;

import nextstep.blackjack.card.PlayingCard;

public class Hands {

	private List<PlayingCard> cards = new ArrayList<>();
	private boolean stay = false;

	public List<PlayingCard> getCards() {
		return cards;
	}

	public void addCard(PlayingCard card){
		cards.add(card);
	}

	public int sumCards(){
		int value = 0;

		for(PlayingCard card : cards){
			value =+ card.getNumber().getNumber(value);
		}

		return value;
	}

	public boolean isStay() {
		return stay;
	}

	public void setStay(boolean stay) {
		this.stay = stay;
	}

	public boolean isBusted(){
		if(this.sumCards() > BLACK_JACK_SUM_VALUE){
			return true;
		}

		return false;
	}
}
