package p1;

class SamePkgSub extends Base {
  SamePkgSub() {
    // pvt = 10; // Will not compile
    def = 20;
    pro = 30;
    pub = 40;
  }
}