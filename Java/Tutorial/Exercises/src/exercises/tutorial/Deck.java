package exercises.tutorial;

public class Deck {

  private Card[] shuffledDeck;

  // CTOR
  public Deck() {
    this.shuffledDeck = new Card[Card.RANKS.length * Card.SUITS.length];
    boolean canAdd;
    int randomSuitIndex, randomRankIndex;
    Card candidate = null;
    int index = 0;


    for (int i = 0; i < Card.SUITS.length; i++)
      for (int j = 0; j < Card.RANKS.length; j++)
        this.shuffledDeck[index++] = new Card(Card.SUITS[i], Card.RANKS[j]);

//      this.shuffle();
  }

  public void shuffle() {
    int[] mixed = new int[this.shuffledDeck.length]; // list of scrambled indices
    int random = -1;
    boolean canAdd;

    for (int i = 0; i < this.shuffledDeck.length; i++) {
      canAdd = false;

      while (!canAdd) {
        random = (int) (Math.random() * this.shuffledDeck.length);
        canAdd = true;
        for (int j = 0; j < i; j++) {
          if (mixed[j] == random)
            canAdd = false;
          break;
        }
      }

      mixed[i] = random;
    }

    Card[] newDeck = new Card[this.shuffledDeck.length];

    for (int i = 0; i < newDeck.length; i++) {
      newDeck[i] = this.shuffledDeck[mixed[i]];
    }

    this.shuffledDeck = newDeck;
  }

  public Card[] getShuffledDeck() {
    return this.shuffledDeck;
  }
}