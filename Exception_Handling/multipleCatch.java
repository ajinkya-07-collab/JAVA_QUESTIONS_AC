
import java.util.Scanner;

public class multipleCatch {

    public static void add() {
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
        } catch (Exception e) {
            System.out.println(e);
        }
        // } catch (InputMismatchException ime) {
        // System.out.println(ime);

        // } catch (ArithmeticException ae) {
        // System.out.println(ae);
        // }
        finally {
            System.out.println("clean up code");
        }

    }

    public static void main(String[] args) {

        add();
    }

}
