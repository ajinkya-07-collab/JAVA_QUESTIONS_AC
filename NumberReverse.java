import java.util.Scanner;

public class NumberReverse {

    public static boolean Palindrome(int num) {
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

        System.out.print("Enter Number :");
        int num = sc.nextInt();

        Boolean ispalindrome = Palindrome(num);

        if (ispalindrome)
            System.out.println(num + " is a Palindrome number.");
        else
            System.out.println(num + " is not a Palindrome number.");
    }
}
