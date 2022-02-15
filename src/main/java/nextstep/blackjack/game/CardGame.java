package nextstep.blackjack.game;

import java.util.List;

import nextstep.blackjack.players.Player;

public interface CardGame {
	public void makeEntry(String names);
	public void setCards();
	public void betMoney();
	public void playGame();
	public void calculateBets(List<Player> players);
}
