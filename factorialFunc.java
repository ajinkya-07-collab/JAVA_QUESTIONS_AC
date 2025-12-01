
import java.util.Scanner;

public class factorialFunc {

    public static void printFactorial(int num) {

        if (num < 0) {
            System.out.println("Invalid Number");
            // return;
        }
        int factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
        // return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printFactorial(num);
    }

}
