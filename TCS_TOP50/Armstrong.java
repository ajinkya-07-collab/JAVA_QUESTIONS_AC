package TCS_TOP50;

import java.util.Scanner;

public class Armstrong {

    public static boolean isArmstrong(int num) {

        int originalNum = num;

        int digits = 0;
        int sum = 0;

        int temp = num;

        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return (originalNum == sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean isArmstrong = isArmstrong(num);

        if (isArmstrong) {
            System.out.println("Is armstrong num");
        } else {
            System.out.println("not Armstrong");
        }

    }

}
