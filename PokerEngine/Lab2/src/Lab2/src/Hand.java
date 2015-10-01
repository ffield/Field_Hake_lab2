package Lab2.src;

import java.util.ArrayList;
import java.util.Collections;

public class Hand extends Deck {
	public static void Hand() {
		ArrayList<String> hand1 = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			hand1.add(Deck.draw());
		}
		{
		}
		System.out.print(hand1);
	}

	// Helper methods getRank and getSuit will parse the card string for the
	// rank and suit values
	public static String getRank(String card) {
		int space = card.indexOf(" ");
		String rank = card.substring(space);
		return rank;
	}

	public static String getSuit(String card) {

		String suit = card.substring(1, 2);
		return suit;
	}

	// This method will evaluate the hand and determine what type it is
	public static void evaluateHand(ArrayList<String> hand1) {

		Collections.sort(hand1);
		// Checking for flush
		boolean flush;
		if (getSuit(hand1.get(0)) == getSuit(hand1.get(1)) && getSuit(hand1.get(0)) == getSuit(hand1.get(2))
				&& getSuit(hand1.get(0)) == getSuit(hand1.get(3)) && getSuit(hand1.get(0)) == getSuit(hand1.get(4))
				&& getSuit(hand1.get(0)) == getSuit(hand1.get(5)) && getSuit(hand1.get(0)) == getSuit(hand1.get(6))) {
			flush = true;
		} else {
			flush = false;
		}

		// Straight Evaluation
		boolean ace;
		boolean straight = false;
		boolean highestStraight = false;
		for (int i = 0; i < 5; i++) {
			if (hand1.get(i) == "A") {
				ace = true;
				break;
			} else {
				ace = false;
			}
		}
		if (ace = true) {
			// Order is Alphabetical
			if (getRank(hand1.get(0)) == "10" && getRank(hand1.get(2)) == "J" && getRank(hand1.get(3)) == "K"
					&& getRank(hand1.get(4)) == "Q") {
				straight = true;
				highestStraight = true;
			}

			else if (getRank(hand1.get(1)) == "2" && getRank(hand1.get(2)) == "3" && getRank(hand1.get(3)) == "4"
					&& getRank(hand1.get(4)) == "5") {
				straight = true;
			}
		}

		// Finding non-Ace straights
		else {
			if (getRank(hand1.get(0)) == "2" && getRank(hand1.get(1)) == "3" && getRank(hand1.get(2)) == "4"
					&& getRank(hand1.get(3)) == "5" && getRank(hand1.get(4)) == "6") {
				straight = true;
			} else if (getRank(hand1.get(0)) == "3" && getRank(hand1.get(1)) == "4" && getRank(hand1.get(2)) == "5"
					&& getRank(hand1.get(3)) == "6" && getRank(hand1.get(4)) == "7") {
				straight = true;
			} else if (getRank(hand1.get(0)) == "4" && getRank(hand1.get(1)) == "5" && getRank(hand1.get(2)) == "6"
					&& getRank(hand1.get(3)) == "7" && getRank(hand1.get(4)) == "8") {
				straight = true;
			} else if (getRank(hand1.get(0)) == "5" && getRank(hand1.get(1)) == "6" && getRank(hand1.get(2)) == "7"
					&& getRank(hand1.get(3)) == "8" && getRank(hand1.get(4)) == "9") {
				straight = true;
			} else if (getRank(hand1.get(0)) == "6" && getRank(hand1.get(1)) == "7" && getRank(hand1.get(2)) == "8"
					&& getRank(hand1.get(3)) == "9" && getRank(hand1.get(4)) == "10") {
				straight = true;
			} else if (getRank(hand1.get(0)) == "7" && getRank(hand1.get(1)) == "8" && getRank(hand1.get(2)) == "9"
					&& getRank(hand1.get(3)) == "10" && getRank(hand1.get(4)) == "J") {
				straight = true;
			} else if (getRank(hand1.get(0)) == "8" && getRank(hand1.get(1)) == "9" && getRank(hand1.get(2)) == "10"
					&& getRank(hand1.get(3)) == "J" && getRank(hand1.get(4)) == "K") {
				straight = true;
			} else if (getRank(hand1.get(0)) == "9" && getRank(hand1.get(1)) == "10" && getRank(hand1.get(2)) == "J"
					&& getRank(hand1.get(3)) == "K" && getRank(hand1.get(4)) == "Q") {
				straight = true;
			} else {
				straight = false;
			}
		}
		// Checking for Royal Flush
		if (highestStraight == true && flush == true) {
			boolean royalFlush = true;
		}
		// Checking for Straight Flush
		if (straight == true && flush == true) {
			boolean straightFlush = true;
		}

		// Checking for Three of a Kind and Four of a Kind
		boolean fourOfAKind;
		boolean threeOfAKind;
		boolean fullHouse;

		if (getRank(hand1.get(0)) == getRank(hand1.get(1)) && getRank(hand1.get(0)) == getRank(hand1.get(2))
				&& getRank(hand1.get(0)) == getRank(hand1.get(3))
				|| (getRank(hand1.get(1)) == getRank(hand1.get(2)) && getRank(hand1.get(1)) == getRank(hand1.get(3))
						&& getRank(hand1.get(1)) == getRank(hand1.get(4)))) {
			fourOfAKind = true;
		} else {
			fourOfAKind = false;
		}

		if ((getRank(hand1.get(0)) == getRank(hand1.get(1)) && getRank(hand1.get(0)) == getRank(hand1.get(2)))) {
			threeOfAKind = true;
			// if a three of a kind is accompanied by a pair it is a full house
			if (getRank(hand1.get(3)) == getRank(hand1.get(4))) {
				fullHouse = true;
			} else {
				fullHouse = false;
			}
		}

		else if (getRank(hand1.get(1)) == getRank(hand1.get(2)) && getRank(hand1.get(1)) == getRank(hand1.get(3))) {
			threeOfAKind = true;
		}

		else if (getRank(hand1.get(2)) == getRank(hand1.get(3)) && getRank(hand1.get(2)) == getRank(hand1.get(4))) {
			threeOfAKind = true;
			if (getRank(hand1.get(0)) == getRank(hand1.get(1))) {
				fullHouse = true;
			} else {
				fullHouse = false;
			}
		} else {
			threeOfAKind = false;
			fullHouse = false;
		}
		// Checking for One Pair and Two Pair
		boolean onePair = false;
		boolean twoPair = false;
		if (threeOfAKind == false && fourOfAKind == false) {
			if (getRank(hand1.get(0)) == getRank(hand1.get(1))) {
				onePair = true;
				if (getRank(hand1.get(2)) == getRank(hand1.get(3)) || getRank(hand1.get(3)) == getRank(hand1.get(4))) {
					twoPair = true;
					onePair = false;
				} else {
					twoPair = false;
				}
			} else if (getRank(hand1.get(1)) == getRank(hand1.get(2))) {
				onePair = true;
				if (getRank(hand1.get(3)) == getRank(hand1.get(4))) {
					twoPair = true;
					onePair = false;
				} else {
					twoPair = false;
				}
			} else if (getRank(hand1.get(2)) == getRank(hand1.get(3))) {
				onePair = true;
			} else if (getRank(hand1.get(3)) == getRank(hand1.get(4))) {
				onePair = true;
			} else {
				onePair = false;
				twoPair = false;
			}
		}

	}
}
