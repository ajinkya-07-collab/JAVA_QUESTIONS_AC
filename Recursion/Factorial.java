package Recursion;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int num) {
        if (num < 0) {
            System.out.println("Factorial not defined for negative numbers");
            return -1;
        }
        if (num == 0) {
            return 1;
        }
        int fct1 = factorial(num - 1);
        int fct = num * fct1;
        return fct;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        System.out.println(factorial(num));
    }

}
