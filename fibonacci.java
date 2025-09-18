
import java.util.Scanner;

public class fibonacci {

    public static void fibonacciSeries(int n) {

        int a = 0, b = 1;

        System.out.print(a + " ");

        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                System.err.print(b + " ");

                int temp = b;
                b = a + b;
                a = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fibonacciSeries(n);

    }

}
