package control;

public class PrimeNumber {

    public static void main(String[] args) {

        int border = 100;

        for (int i = 1; i <= border; i++) {
            boolean isPrime = true;
            for (int j = 2; j < (i + 2)/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }

    }

}
