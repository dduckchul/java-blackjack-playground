package nextstep.blackjack;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import nextstep.blackjack.card.Number;
import nextstep.blackjack.card.PlayingCard;
import nextstep.blackjack.card.Shape;

public class CardTest {

	@Test
	public void cardTest(){
		List<PlayingCard> deck = PlayingCard.makeDeck();
		PlayingCard card = new PlayingCard(Shape.CLUB, Number.ONE);

		assertThat(card).isEqualTo(deck.get(0));
	}

	@Test
	public void deckMakeTest(){
		List<PlayingCard> deck = PlayingCard.makeDeck();
		assertThat(deck).hasSize(52);

		List<PlayingCard> decks = PlayingCard.makeDeck(3);
		assertThat(decks).hasSize(156);

		PlayingCard.shuffleCards(deck);

		for(PlayingCard card : deck){
			System.out.println(card.toString());
		}
	}
}
