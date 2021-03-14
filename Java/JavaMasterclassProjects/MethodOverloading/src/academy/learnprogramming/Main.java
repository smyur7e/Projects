package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Sridhar", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double feet = -13;
        double inches = 1;
        System.out.println(feet + " feet and " +
                inches + " inches = " +
                calcFeetAndInchesToCentimeters(feet, inches) + " centimeters"
        );
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    // challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double centimeters = -1;

        if (feet >= 0 && inches >= 0 && inches <= 12) {
            // using the overloaded version that takes only inches
            centimeters = calcFeetAndInchesToCentimeters(feet * 12 + inches);
        }

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        return (inches >= 0)? inches * 2.54 : -1;
    }
}
