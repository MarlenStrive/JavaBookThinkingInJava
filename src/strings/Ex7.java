package strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex7 {
    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring! period.";

    public static boolean check(String s) {
        Pattern p = Pattern.compile("^[A-Z].*\\.$");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void replace(String regex, String replacement) {
        System.out.println(knights.replaceAll(regex, replacement));
    }
    public static void main(String[] args) {
        System.out.println(check(knights));

        split("the|you");

        replace("[aeiouAEIOU]", "_");
    }


}
