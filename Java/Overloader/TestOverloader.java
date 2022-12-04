class TestOverloader {
  public static void main(String args[]) {
    byte b = 126;
    int i = 12345;
    long l = 23456789012L;
    float f = 123.456f;
    double d = Math.PI; // PI is a static member of the class System.Lang.Math;


    System.out.println("Overloader(byte) has value " + (new Overloader(b)).getOb());
    System.out.println("Overloader(int) has value " + (new Overloader(i)).getOi());
    System.out.println("Overloader(long) has value " + (new Overloader(l)).getOl());
    System.out.println("Overloader(float) has value " + (new Overloader(f)).getOf());
    System.out.println("Overloader(double) has value " + (new Overloader(d)).getOd());
  }
}