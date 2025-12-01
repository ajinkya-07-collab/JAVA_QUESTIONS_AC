
import java.util.Scanner;

public class GCD {

    public static int gcd(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }

    public static int lcm(int n1, int n2) {
        return (n1 * n2) / gcd(n1, n2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("GCD = " + gcd(a, b));
        System.out.println("LCM = " + lcm(a, b));
    }

}

/*
 * public static int findGCD(int n1, int n2) {
 * while(n2 != 0) {
 * int temp = n2;
 * n2 = n1 % n2;
 * n1 = temp; //optimised way
 * }
 * return n1;
 * }
 */

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n1 = sc.nextInt();
// int n2 = sc.nextInt();

// System.out.println("GCD is " + gcd(n1, n2));

// }

// }
