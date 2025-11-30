import java.util.Scanner;

public class reverseStr {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        for (int i = 0; i < sb.length() / 2; i++) {

            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }

}
// import java.util.Scanner;

// public class ReverseString {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a string: ");
// String input = sc.nextLine();
// String reversed = "";

// Using a for loop (Manual Reverse)

// // Iterate from end to start
// for (int i = input.length() - 1; i >= 0; i--) {
// reversed += input.charAt(i);
// }

// System.out.println("Reversed string: " + reversed);
// }
// }

// Using StringBuilder (Recommended & Efficient)

// import java.util.Scanner;

// public class ReverseStringBuilder {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a string: ");
// String input = sc.nextLine();

// StringBuilder sb = new StringBuilder(input);
// String reversed = sb.reverse().toString();

// System.out.println("Reversed string: " + reversed);
// }
// }

// Using a char[] array

// import java.util.Scanner;

// public class ReverseWithCharArray {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a string: ");
// String input = sc.nextLine();

// char[] chars = input.toCharArray();
// System.out.print("Reversed string: ");
// for (int i = chars.length - 1; i >= 0; i--) {
// System.out.print(chars[i]);
// }
// }
// }
