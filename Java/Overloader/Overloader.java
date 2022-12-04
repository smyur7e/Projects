class Overloader {
  private byte ob;
  private int oi;
  private long ol;
  private float of;
  private double od;

  // Overloader Constructors
  Overloader (byte b) {
    ob = b;
  }

  Overloader (int i) {
    oi = i;
  }

  Overloader (long l) {
    ol = l;
  }

  Overloader (float f) {
    of = f;
  }

  Overloader (double d) {
    od = d;
  }

  byte getOb() { return ob; }

  int getOi() { return oi; }

  long getOl() { return ol; }

  float getOf() { return of; }

  double getOd() { return od; }
}