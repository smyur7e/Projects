class FloatPromotionTest {
  public static void main(String[] args) {
    byte b = 2;
    int i = 4;
    float f = 6.0f; // needs trailing 'f'

    float result1 = f / i / 2;
    float result2 = f / (i / 2);

    System.out.println
      (f + " / " + i + " / " + b + " = " + result1);
    System.out.println
      (f + " / (" + i + " / " + b + ") = " + result2);
  }
}