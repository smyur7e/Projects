package exercises.tutorial;

public class Card {

  public static final String[] SUITS = {
      "Clubs", "Diamonds", "Hearts", "Spades"
  };

  public static final String[] RANKS = {
    "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
  };

  private String suit;
  private String rank;

  // Constructor
  public Card(String suit, String rank) {
    this.suit = suit;
    this.rank = rank;
  }

  // Getters
  public String getSuit() {
    return this.suit;
  }

  public String getRank() {
    return this.rank;
  }
}