package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double LB_TO_KG_RATE = 0.45359237d;
        double weightInLb = 150.00d;
        double weightInKg = weightInLb * LB_TO_KG_RATE;
        System.out.println(weightInLb + "lbs = " + weightInKg + "kg.");
    }
}
