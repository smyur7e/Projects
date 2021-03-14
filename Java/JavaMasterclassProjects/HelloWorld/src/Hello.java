/*
Java is CASE sensitive.

"public", "class" are keywords - have a specific meaning
"public" keyword is an ACCCESS modifier controls the extent
to which other parts of the code can access this code.
ACCESS modifiers like "public" are OPTIONAL.

"class" defines a class - what the hell is a class..
we will see later. however, it must have opening and
closing {paranthesis}. it can have both data and code.
*/
public class Hello {

    /*
    A statement is a complete command - i.e. an instruction
    asking the computer to do something.

    Any method is a collection of statements (one or more),
    that perform a set of instruction in sequence.

    A method can be "called" from another part of a program
    as part of a command. You can create your own method.

    However, the "main" method is the entry point of any Java code.

    It MUST be defined as below.

    "public" - makes it visible to ALL code.
    "void" - indicates the method does not return a value.

    All methods must have have {paranthesis} to be
    defined.

    "println" is a method and
    */
    public static void main(String[] args) {
//        System.out.println("Hello World");
        System.out.println("Hello Sridhar");

        /*
        A variable is NAME given to a memory
        location. We "declare" variables using
        a TYPE and a NAME for the variable.

        Java operators perform an operation on
        a variable.
        */
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        /*
        Any set of characters enclosed in "double quotes" is a "String"
        literal in Java.

        A literal is a value - it's value CANNOT be changed (unlike a
        variable).
        */
        System.out.println("The value of the variable 'myTotal' = " + myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println("The value of the variable 'myLastOne' = " + myLastOne);
    }
}
