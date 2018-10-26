package control;

public class VampireNumber {


    public static int[] getNumbers(int number) {
        int[] numbers = new int[4];
        int remainder = number;

        for (int i = 3; i >= 0; i--) {
            int base = (int) Math.pow(10, i);
            numbers[i] = remainder / base;
            remainder -= numbers[i] * base;
        }
        /*
        numbers[3] = remainder / 1000;
        remainder -= numbers[3] * 1000;
        numbers[2] = remainder / 100;
        remainder -= numbers[2] * 100;
        numbers[1] = remainder / 10;
        remainder -= numbers[1] * 10;
        numbers[0] = remainder / 1;
        */

        return numbers;
    }

    public static void checkVampireNumber(int number) {

        int[] numbers = getNumbers(number);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int m = 0; m < 4; m++) {
                        if (i != j && i != k && i != m && j != k && j != m && k != m) {
                            if (numbers[i] != 0 && numbers[k] != 0) {
                                int n1 = numbers[i] * 10 + numbers[j];
                                int n2 = numbers[k] * 10 + numbers[m];
                                if (n1 * n2 == number) {
                                    System.out.println(number + " = " + n1 + " * " + n2);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            checkVampireNumber(i);
        }
    }

}
