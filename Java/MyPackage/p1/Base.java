package p1;

class Base {
  private int pvt;
  int def;
  protected int pro;
  public int pub;

  Base() {
    pvt = 1;
    def = 2;
    pro = 3;
    pub = 4;
  }

  public String ToString() {
    String value =
      "pvt = " + pvt
      + ", def = " + def
      + ", pro = " + pro
      + ", pub = " + pub;

    return value;    
  }
}