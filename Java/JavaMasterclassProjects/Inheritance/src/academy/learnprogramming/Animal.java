package academy.learnprogramming;

public class Animal {

  // Constructor
  public Animal(String name, int brains, int body, int size, int weight) {
    this.name = name;
    this.brains = brains;
    this.body = body;
    this.size = size;
    this.weight = weight;
  }

  // Getters
  public String getName() {
    return name;
  }

  public int getBrains() {
    return brains;
  }

  public int getBody() {
    return body;
  }

  public int getSize() {
    return size;
  }

  public int getWeight() {
    return weight;
  }

  public void eat() {
    System.out.println("Animal.eat() called!");
  }

  public void move(int speed) {
    System.out.println("Animal.move() called. Animal is moving at " + speed);
  }

  private String name;
  private int brains;
  private int body;
  private int size;
  private int weight;

}
