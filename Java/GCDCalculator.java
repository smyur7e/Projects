class GCDCalculator {
  public static void main(String[] args) {
    int a = 48, b = 60;
    int dividend = a, divisor = b;

    if (a < b) {
      divisor = a;
      dividend = b;
    }

    for (int remainder = dividend % divisor;
        remainder > 0;
        remainder = dividend % divisor) {
      dividend = divisor;
      divisor = remainder;
    }

    System.out.println(
      "GCD(" + a + "," + b + ") = " + divisor);
  }
}