import java.util.Scanner;

public class StringSubsets {

    public static void stringSubsets(String str) {

        // empty subset
        System.out.print("" + ",");

        // single characters
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + ",");
        }

        // two characters
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                System.out.print("" + str.charAt(i) + str.charAt(j) + ",");
            }
        }

        // three characters (only works for length >= 3)
        if (str.length() >= 3) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();

        stringSubsets("abc");
    }
}