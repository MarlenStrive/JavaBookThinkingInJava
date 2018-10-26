package object;

// TIJ4 Chapter Object, Exercise 10, page 90
// Write a program that prints three arguments taken from the command line. To do // this you'll need to index into the command-line array of Strings.

import org.jetbrains.annotations.NotNull;

public class CommandArgTest {
    public static void main(@NotNull String[] args) {
        System.out.println("args[0] = " + args[0]);
        System.out.println("args[1] = " + args[1]);
        System.out.println("args[2] = " + args[2]);
    }
}