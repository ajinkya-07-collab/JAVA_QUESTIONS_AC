import java.util.Scanner;

public class ExceptionDemo {

    static void add(int x, int y) {
        Scanner sc = new Scanner(System.in);
        System.out.println("start code");

        boolean success = false;
        while (!success) {
            try {
                System.out.println(x / y);
                success = true;
                break;
            } catch (Exception e) {
                System.out.println("0 Not allowed enter valid value enetr value for y010");
                System.out.print("Enter y :");
                y = sc.nextInt();
            }
            System.out.println("end code");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x :");
        int x = sc.nextInt();
        System.out.print("Enter y :");
        int y = sc.nextInt();

        System.out.println("start Main");

        add(x, y);

        System.out.println("End Main");

    }
}