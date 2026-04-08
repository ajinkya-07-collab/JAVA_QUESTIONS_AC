package TCS_TOP50;

import java.util.Scanner;

public class ReverseNumber {

    public static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        System.out.println("Reverse of " + temp + " is " + rev);
        return (temp == rev);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean isPalindrome = isPalindrome(num);

        if (isPalindrome) {
            System.out.println("is Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }

}
