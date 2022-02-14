package nextstep.blackjack.players;

import nextstep.blackjack.card.Hands;

abstract class Gamer {
	private int betMoney;
	private Hands hands = new Hands();

	abstract public String getName();

	public int getBetMoney() {
		return betMoney;
	}

	public void setBetMoney(int betMoney) {
		this.betMoney = betMoney;
	}

	public Hands getHands() {
		return hands;
	}
}