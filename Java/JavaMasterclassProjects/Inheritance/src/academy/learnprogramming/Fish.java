package academy.learnprogramming;

public class Fish extends Animal{

  // Constructor
  public Fish(String name,
              int size,
              int weight,
              int gills,
              int eyes,
              int fins) {
    super(name, 1, 1, size, weight);
    this.gills = gills;
    this.eyes = eyes;
    this.fins = fins;
  }

  public void rest() {

  }

  public void swim(int speed) {
    this.moveMuscles();
    this.moveBackFin();
    super.move(speed);
  }

  public void moveMuscles() {
  }

  public void moveBackFin() {
  }


  private int gills;
  private int eyes;
  private int fins;
}
