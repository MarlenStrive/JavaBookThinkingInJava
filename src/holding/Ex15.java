package holding;

import net.mindview.util.Stack;

public class Ex15 {
    public static void main(String[] args) {

        String s = "+U+n+c---+e+r+t---+a+i+n+t+y---+ -+r+u--+l+e+s---";
        String[] ss = s.split("");
        Stack<String> stack = new Stack<>();

        int i = 0;
        while(i < ss.length) {
            switch (ss[i]) {
                case "+":
                    stack.push(ss[i + 1]);
                    i+=2;
                    break;
                case "-":
                    System.out.print(stack.pop());
                    i++;
                    break;
                default:
                    // throw error - not correct format
                    i++;
            }
        }

        System.out.println();
        System.out.println(stack);
    }
}