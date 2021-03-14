package exercises.tutorial;
import java.util.*;

public class LotteryTicket {

  private ArrayList<Game> games;
  private int noOfGames;

  private static class Game {
    private final static int MAINSIZE = 7;
    private final static int SUPPSIZE = 1;
    private int[] main;
    private int[] supp;

    private static boolean isValidGame(int[] main, int[] supp) {

      if (!isValidNumbers(main, Game.MAINSIZE) ||
          !isValidNumbers(supp, Game.SUPPSIZE))
        return false;

      // MAINSZIZE number of unique numbers must be supplied
      HashSet <Integer> h = new HashSet<Integer>();

      // each main number must be within 1 & 99
      for (int i = 0; i < main.length; i++)
        h.add(main[i]);

      if (h.size() < Game.MAINSIZE)
        return false; // has duplicates
      else
        return true;
    }

    private static boolean isValidNumbers(int[] gameNos, int size) {
      // check existence and size
      if (gameNos == null || gameNos.length < size)
        return false;

      // power number must be between 1 & 99
      for (int i = 0; i < gameNos.length; i++)
        if (!(gameNos[i] > 0 && gameNos[i] < 100))
          return false;

      return true;
    }

    private boolean hasMainNumber(int num) {
      for (int i = 0; i < this.main.length; i++)
        if (this.main[i] == num)
          return true;

      return false;
    }

    private boolean hasMain(int[] main) {
      for (int i = 0; i < main.length; i++)
        if (!this.hasMainNumber(main[i]))
          return false;

      return true;
    }

    private Game(int[] main, int[] supp) {
      if (Game.isValidGame(main, supp)) {
        this.main = main;
        this.supp = supp;
      }
    }

    private int[] getMain() {
      return main;
    }

    private int[] getSupp() {
      return supp;
    }

    public String toString() {
      return Arrays.toString(this.main) + " (" + Arrays.toString(this.supp) + ")";
    }
  }

  public LotteryTicket(int noOfGames) {
    if (noOfGames > 0) {
      this.noOfGames = noOfGames;
      this.games = new ArrayList<Game>(noOfGames);
    }
  }

  public Game addGame(int[] main, int[] supp) {

    if (this.games.size() < this.noOfGames) {

      // check if the main numbers are part of another game.
      for (Game g : this.games)
        if (g.hasMain(main))
          return null;

      Game g = new Game(main, supp);
      this.games.add(g);
      return g;
    } else
      return null;
  }

  public String toString() {
    StringBuilder toReturn = new StringBuilder();

    for (Game g: games)
      if (g != null) {
        if (toReturn.length() > 0)
          toReturn.append("\n");
        toReturn.append("Game " + games.indexOf(g) + ": " + g.toString());
      }

    return toReturn.toString();
  }

  public static String getWinner(LotteryTicket lucky
      , int[] drawnMain
      , int[] drawnSupp) {

    Map <Game, Integer> scoreboard
        = new HashMap<Game, Integer>();
    Game winner = null;
    int winDiv = 0;

    // intialise scoreboard
    for (Game g: lucky.games) {
      int mainMatches = 0;

      if (g.hasMain(drawnMain))
        mainMatches = Game.MAINSIZE;
      else
        for (int i = 0; i < drawnMain.length; i++)
          if (g.hasMainNumber(drawnMain[i]))
            ++mainMatches;

      int gameDiv = 0;
      boolean powerballMatch =
          drawnSupp == g.getSupp();

      if (mainMatches == Game.MAINSIZE && powerballMatch)
        gameDiv = 1;
      else if (mainMatches == Game.MAINSIZE)
        gameDiv = 2;
      else if (mainMatches == Game.MAINSIZE - 1 && powerballMatch)
        gameDiv = 3;
      else if (mainMatches == Game.MAINSIZE - 1)
        gameDiv = 4;
      else if (mainMatches == Game.MAINSIZE - 2 && powerballMatch)
        gameDiv = 5;
      else if (mainMatches == Game.MAINSIZE - 3 && powerballMatch)
        gameDiv = 6;
      else if (mainMatches == Game.MAINSIZE - 2)
        gameDiv = 7;
      else if (mainMatches == Game.MAINSIZE - 4 && powerballMatch)
        gameDiv = 8;
      else if (mainMatches == Game.MAINSIZE - 4 && powerballMatch)
        gameDiv = 9;

      scoreboard.put(g, gameDiv);

      if (winDiv == 0 ||
          gameDiv < winDiv) {
        winner = g;
        winDiv = gameDiv;
      }
    }

    if (winDiv == 0)
      return "None";
    else
      return String.format("Division: %3d, Game: %s",
          winDiv, winner);
  }
  
}