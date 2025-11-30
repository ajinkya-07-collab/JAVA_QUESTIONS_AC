import java.util.Scanner;

public class DigitCount {

    public static void Digits(int num) {
        int count = 0;
        int temp = num;

        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {

                num = num / 10;
                count++;
            }
        }
        System.out.println("Total digits in " + temp + " is " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        Digits(num);
    }
}
