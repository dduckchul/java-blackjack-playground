package nextstep.blackjack.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class PlayingCard {

	private Shape shape;
	private Number number;

	public PlayingCard(Shape shape, Number number){
		this.shape = shape;
		this.number = number;
	}

	public Shape getShape() {
		return shape;
	}

	public Number getNumber() {
		return number;
	}

	public static List<PlayingCard> makeCardByShape(Shape shape, Number[] nums){
		List<PlayingCard> cards = new ArrayList<>();

		for(Number num : nums){
			cards.add(new PlayingCard(shape, num));
		}

		return cards;
	}

	public static List<PlayingCard> makeDeck(){
		Shape[] shapes = Shape.values();
		Number[] nums = Number.values();

		List<PlayingCard> deck = new ArrayList<>();

		for(Shape shape : shapes){
			List<PlayingCard> cards = makeCardByShape(shape, nums);
			deck.addAll(cards);
		}

		return deck;
	}

	public static List<PlayingCard> makeDeck(int sets){
		List<PlayingCard> decks = new ArrayList<>();

		for(int i = 0; i < sets; i++){
			decks.addAll(makeDeck());
		}

		return decks;
	}

	public static void shuffleCards(List<PlayingCard> deck){
		Collections.shuffle(deck);
	}

	@Override
	public String toString() {
		return this.number.name() + " " + this.shape.name();
	}

	@Override
	public int hashCode() {
		return Objects.hash(shape, number);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}

		if(obj == null || getClass() != obj.getClass()){
			return false;
		}

		PlayingCard card = (PlayingCard)obj;

		return this.shape == card.getShape() && this.number == card.getNumber();
	}
}
