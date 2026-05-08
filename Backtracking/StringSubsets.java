package Backtracking;

import java.util.Scanner;

public class StringSubsets {

    public static void stringSubsets(String str, String result, int i) {

        // base case
        if (i == str.length()) {
            System.out.println(result);
            return;
        }

        // include current character
        stringSubsets(str, result + str.charAt(i), i + 1);

        // exclude current character
        stringSubsets(str, result, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        stringSubsets(str, "", 0);
    }
}