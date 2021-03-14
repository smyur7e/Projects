package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VarArgsVsArrayTest t1 = new VarArgsVsArrayTest(
            new String[] {"one", "two", "three"});

        VarArgsVsArrayTest t2 = new VarArgsVsArrayTest( // Can use this only with var args
            "one", "two", "three");

        System.out.println("t1.toString() = " + t1.toString());
        System.out.println("t2.toString() = " + t2.toString());
    }
}
