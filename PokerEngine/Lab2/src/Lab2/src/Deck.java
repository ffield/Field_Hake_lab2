package Lab2.src;

import java.util.ArrayList;
import java.util.Collections;

public class Deck extends Card {
	public static ArrayList<String> fullDeck = new ArrayList<String>();

	static void Deck() {
		fullDeck = new ArrayList<String>();
		makeDeck();
		System.out.println(fullDeck);
		// System.out.println(cardsLeft());
	}

	public static void shuffleDeck() {
		Collections.shuffle(fullDeck);
	}

	public static void makeDeck() {
		for (int i = 0; i < 13; i++) {

			for (i = 0; i < 13; i++) {
				fullDeck.add(Rank[i] + " " + Suit[0]);
			}
			for (i = 0; i < 13; i++) {
				fullDeck.add(Rank[i] + " " + Suit[1]);
			}
			for (i = 0; i < 13; i++) {
				fullDeck.add(Rank[i] + " " + Suit[2]);
			}
			for (i = 0; i < 13; i++) {
				fullDeck.add(Rank[i] + " " + Suit[3]);
			}
		}
		shuffleDeck();
		// System.out.println(fullDeck);
	}

	public static String draw() {
		String draw1 = fullDeck.get(0);
		fullDeck.remove(0);
		// System.out.println(draw1);
		return draw1;
	}

	public static int cardsLeft() {
		return fullDeck.size();
	}

}
