package TCS_TOP50;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next().toLowerCase();
        String str2 = sc.next().toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram String");
        }

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("It is Anagram String");
        } else {
            System.out.println("Not Anagram String");
        }
    }

}
