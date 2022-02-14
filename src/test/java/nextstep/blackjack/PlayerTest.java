package nextstep.blackjack;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.Stack;

import org.junit.jupiter.api.Test;

import nextstep.blackjack.card.Number;
import nextstep.blackjack.card.PlayingCard;
import nextstep.blackjack.card.Shape;
import nextstep.blackjack.players.Dealer;
import nextstep.blackjack.players.Player;
import nextstep.blackjack.util.PlayerUtil;

public class PlayerTest {

	@Test
	public void makeGamerTest(){
		Dealer dealer = new Dealer();
		Player p1 = new Player("철수");

		assertThat(dealer.getName()).isEqualTo(PlayerUtil.DEALER_NAME);
		assertThat(p1.getName()).isEqualTo("철수");
	}

	@Test
	public void gamerCardTest(){
		Stack<PlayingCard> deck = new Stack<>();
		deck.addAll(PlayingCard.makeDeck());

		PlayingCard card = deck.pop();
		PlayingCard testCard = new PlayingCard(Shape.DIAMOND, Number.KING);

		Player p1 = new Player("철수");
		p1.addCard(card);

		assertThat(p1.getHand().get(0)).isEqualTo(testCard);
	}
}