package object;

// TIJ4 Chapter Object, Exericise 1, page 89
// object/PrimitiveTest.java
// Create a class containing an int and a char that are not intitialized
// and print their values to verify that Java performs default initialization.

public class PrimitiveTest {
    private int i;
    private char c;

    public static void main(String[] args) {
        PrimitiveTest obj = new PrimitiveTest();

        System.out.println("i = " + obj.i);
        System.out.println("c = " + obj.c);
    }
}
