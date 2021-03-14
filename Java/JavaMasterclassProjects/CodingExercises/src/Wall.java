public class Wall {
  // static tester
  public static void test() {
    Wall point = new Wall();
    Wall brWall = new Wall(5.2, 4.1);
    Wall negH = new Wall(1, -1);
    Wall negW = new Wall(-1.2, 1);

    System.out.println("O R I G I N A L" +
        "   " + "A R E A S");
    System.out.println("----------------" +
        "   " + "---------");
    System.out.println("point's area = " +
        point.getArea());
    System.out.println("brWall's area =" +
        brWall.getArea());
    System.out.println("negH's area = " +
        negH.getArea());
    System.out.println("negW's area = " +
        negW.getArea());

    System.out.println("A L T E R E D" +
        "   " + "A R E A S");
    System.out.println("-------------" +
        "   " + "---------");
    brWall.setHeight(2.3458);
    brWall.setHeight(1.567);
    negH.setHeight(-1); negH.setWidth(1.345423);
    negW.setHeight(1.453); negW.setWidth(-3452.12342);
    System.out.println("point's area = " +
        point.getArea());
    System.out.println("brWall's area =" +
        brWall.getArea());
    System.out.println("negH's area = " +
        negH.getArea());
    System.out.println("negW's area = " +
        negW.getArea());
  }

  // Constructors
  public Wall() {
  }

  public Wall(double width, double height) {
    if (width >= 0) {
      this.width = width;
    }

    if (height >= 0) {
      this.height = height;
    }
  }

  // Getters
  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  // Setters
  public void setWidth(double width) {
    if (width < 0) {
      this.width = 0;
    } else {
      this.width = width;
    }
  }

  public void setHeight(double height) {
    if (height < 0) {
      this.height = 0;
    } else {
      this.height = height;
    }
  }

  public double getArea() {
    return this.width * this.height;
  }

  private double width;
  private double height;
}
