package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Animal a = new Animal("Animal", 1, 1, 5, 5);
        Dog d = new Dog("Yorkie", 8, 20,2, 4, 1, 20, "long Silky");

//        d.eat();
        d.walk();
//        d.run();
    }
}
