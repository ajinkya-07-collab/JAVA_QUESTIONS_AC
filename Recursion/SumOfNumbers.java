package Recursion;

import java.util.Scanner;

public class SumOfNumbers {

    public static int sumNumbers(int N) {

        if (N == 1) {
            return 1;
        }
        int sum1 = sumNumbers(N - 1);
        int sum = N + sum1;
        return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        System.out.println(sumNumbers(N));

    }

}
