import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatchdemo {

    static void fun() {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        try {
            x = sc.nextInt();
            y = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("int ahe string nhi");
        }
        System.out.println("Start Fun");

        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("Y chi value valid nhi ye");
        }
        ;
    }

    public static void main(String[] args) {
        System.out.println("Start Main");
        fun();
        System.out.println("End Main");
    }
}
