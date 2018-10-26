package operators;

//: operators/CoinToss.java
// TIJ4 Chapter Operators, Exercise 7, page 106
// Write a program that simulates coin-flipping

import java.util.*;

class CoinToss {
    static String flipp() {
        Random rand = new Random();
        int coin = rand.nextInt(10);
        if (coin % 2 == 0) {
            return "heads";
        }
        return "tails";
    }
}

public class CoinTossTest {
    public static void main(String[] args) {
        int i = 0;
        int heads = 0;
        int tails = 0;
        String res;

        while(i < 100) {
            res = CoinToss.flipp();
            //System.out.println(res);

            if (res.equals("heads")) {
                heads++;
            } else {
                tails++;
            }

            i++;
        }

        System.out.println("Heads count " + heads + ", tails count " + tails);
    }
}