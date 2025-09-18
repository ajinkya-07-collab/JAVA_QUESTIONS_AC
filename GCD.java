
import java.util.Scanner;

public class GCD {

    public static int gcd(int n1, int n2) {
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        return n2;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("GCD is " + gcd(n1, n2));

    }

}
