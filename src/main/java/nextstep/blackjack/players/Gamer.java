package nextstep.blackjack.players;

import java.util.ArrayList;
import java.util.List;

import nextstep.blackjack.card.PlayingCard;

abstract class Gamer {
	private int betMoney;
	private List<PlayingCard> hand = new ArrayList<>();

	abstract public String getName();

	public int getBetMoney() {
		return betMoney;
	}

	public void setBetMoney(int betMoney) {
		this.betMoney = betMoney;
	}

	public void addCard(PlayingCard card){
		hand.add(card);
	}

	public List<PlayingCard> getHand(){
		return this.hand;
	}
}