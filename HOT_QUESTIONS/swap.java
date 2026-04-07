

public class swap {

    public static void main(String[] args) {

        int a = 10, b = 20;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        int temp = b;
        b = a;
        a = temp;
        System.out.println("a =" + a);
        System.out.println("b =" + b);

        int x = 5, y = 6;
        System.out.println("x =" + x);
        System.out.println("y =" + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x =" + x);
        System.out.println("y =" + y);

    }

}
