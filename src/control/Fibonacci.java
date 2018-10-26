package control;

public class Fibonacci {

    /*
    public static void main(String[] args) {

        int elements = Integer.parseInt(args[0]); // convert String to Int

        int first = 1;
        int second = 1;

        if (elements >= 1) {
            System.out.print(first + " ");
        }
        if (elements >= 2) {
            System.out.print(second + " ");
        }
        if (elements <= 2) {
            return;
        }

        for (int i = 3; i <= elements; i++) {
            int res = first + second;
            first = second;
            second = res;
            System.out.print(res + " ");
        }

    }
    */

    int fib(int n) {
        if (n < 2) return 1;
        return (fib(n - 2) + fib(n - 1));
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int k = Integer.parseInt(args[0]);
        System.out.println("First " + k + " Fibonacci number(s): ");
        for (int i = 0; i < k; i++)
            System.out.println(f.fib(i));
    }
}
