public class Carpet {

  // Constructor
  public Carpet(double cost) {
    if (cost < 0) {
      this.cost = 0;
    } else {
      this.cost = cost;
    }
  }

  // Getters


  public double getCost() {
    return cost;
  }

  private double cost;
}