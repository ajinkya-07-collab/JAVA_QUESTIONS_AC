package Recursion;

import java.util.Scanner;

public class PrintNumbers_N21 {

    // Recursion function Print N to 1 in decreasing;
    public static void printDecreasin(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printDecreasin(n - 1);
    }

    // Recursion function Print 1 to N in increasin order
    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        printDecreasin(n);
        System.out.println();
        printIncreasing(n);

    }

}
