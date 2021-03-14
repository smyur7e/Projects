package academy.learnprogramming;

public class Dog extends Animal {

  // Constructor
  public Dog(String name,
             int size,
             int weight,
             int eyes,
             int legs,
             int tail,
             int teeth,
             String coat) {
    super(name, 1, 1, size, weight);
    this.eyes = eyes;
    this.legs = legs;
    this.tail = tail;
    this.teeth = teeth;
    this.coat = coat;
  }

  @Override
  public void eat() {
    System.out.println("Dog.eat() called!");
    this.chew();
    super.eat();
  }

  public void walk() {
    System.out.println("Dog.walk() called!");
    move(5);
  }

  public void run() {
    System.out.println("Dog.run() called!");
    move(10);
  }

  private void moveLegs(int speed) {
    System.out.println("Dog.moveLegs() called. Dog legs moving at " + speed);
  }

  @Override
  public void move(int speed) {
    System.out.println("Dog.move() called!");
    this.moveLegs(speed);
    super.move(speed);
  }

  private void chew() {
    System.out.println("Dog.chew() called!");
  }

  private int eyes;
  private int legs;
  private int tail;
  private int teeth;
  private String coat;
}
