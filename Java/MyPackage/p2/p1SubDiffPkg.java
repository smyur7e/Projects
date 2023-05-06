package p2;
import p1.*;

class P1SubDiffPkg extends Base {

  p1SubDiffPkg() {
    // pvt = 11; // Will not compile - private member
    // def = 21; // Will not compile - not same package
    pro = 31;
    pub = 41;
  }
}