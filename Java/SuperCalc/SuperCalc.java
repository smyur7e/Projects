class SuperCalc {

  public static void main(String[] args) {

    double currBal = 350_000;
    double perDep = 27_000 * (1 - 15 / 100);
    double intRate = 6.0 / 100;
    int perNum = 8;
    double[] futureBal = new double[perNum + 1]; futureBal[0] = currBal;

    System.out.println("Staring Balance = $" + futureBal[0]);
    // System.out.println("Interest Rate per Period = " + (intRate * 100) + "%");
    System.out.println("Interest Rate per Period = " + intRate);
    System.out.println("Number of Periods for projection = " + perNum);
    System.out.println("Staring Calcuation...\n");

    for (int i = 1; i < (perNum + 1); i++) {
      futureBal[i] = (futureBal[i-1]  + perDep) * (1 + intRate);
      System.out.println("Balance after " + i + " year(s) = $" + futureBal[i]);
    }
  }
}