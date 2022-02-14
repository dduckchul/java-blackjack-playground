package nextstep.blackjack;

import java.util.List;

import org.junit.jupiter.api.Test;

import nextstep.blackjack.card.PlayingCard;

import static org.assertj.core.api.Assertions.assertThat;

public class CardTest {

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
