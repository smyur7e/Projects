package p1;

public class Base {
  private int pvt;
  int def;
  protected int pro;
  public int pub;

  public Base() {
    pvt = 1;
    def = 2;
    pro = 3;
    pub = 4;
  }

  public String toString() {
    String value =
      "pvt = " + pvt
      + ", def = " + def
      + ", pro = " + pro
      + ", pub = " + pub;

    return value;    
  }
}