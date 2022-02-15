package nextstep.blackjack.game;

import static nextstep.blackjack.util.BlackJackGameUtil.*;

import java.util.ArrayList;
import java.util.List;

import nextstep.blackjack.card.Deck;
import nextstep.blackjack.card.PlayingCard;
import nextstep.blackjack.players.Dealer;
import nextstep.blackjack.players.Gamer;
import nextstep.blackjack.players.Player;
import nextstep.blackjack.view.InputView;

public class BlackJack implements CardGame {
	private List<Player> players = new ArrayList<>();
	private Dealer dealer;
	private Deck deck;

	@Override
	public void makeEntry(String names) {
		if(names == null || names.isEmpty()){
			new IllegalArgumentException(ENTRY_NAME_EMPTY_EXCEPTION);
		}

		String [] nameArr = names.split(",");
		for (String name : nameArr){
			players.add(new Player(name));
		}

		dealer = new Dealer();
	}

	@Override
	public void setCards() {
		List<PlayingCard> cards = PlayingCard.makeDeck();
		PlayingCard.shuffleCards(cards);
		deck = new Deck(cards);
	}

	@Override
	public void betMoney() {
		if(players == null || players.isEmpty()){
			new IllegalArgumentException(PLAYER_EMPTY_EXCEPTION);
		}

		for(Player player : players){
			int money = InputView.bettingInputMsg("");
			player.setBetMoney(money);
		}
	}

	@Override
	public void playGame() {
		for(Player player : players){
			this.hitCards(player, INITIAL_CARDS_DRAW_NUM);
		}

		this.hitCards(dealer, INITIAL_CARDS_DRAW_NUM);
	}

	private void hitCard(Gamer gamer){
		gamer.addCard(deck.drawCard());
	}

	private void hitCards(Gamer gamer, int loop){
		for(int i = 0; i < loop; i++){
			this.hitCard(gamer);
		}
	}

	@Override
	public void calculateBets(List<Player> players) {

	}

	public List<Player> getPlayers() {
		return players;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public Deck getDeck() {
		return deck;
	}
}
