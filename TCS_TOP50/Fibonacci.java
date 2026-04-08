package TCS_TOP50;

import java.util.Scanner;

public class Fibonacci {

    public static void FibonacciSeries(int n) {

        int a = 0;
        int b = 1;

        for (int i = 1; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FibonacciSeries(n);
    }

}
