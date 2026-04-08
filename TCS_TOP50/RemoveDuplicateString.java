package TCS_TOP50;

import java.util.Scanner;

public class RemoveDuplicateString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            boolean isDuplicate = false;

            for (int j = 0; j < result.length(); j++) {
                if (ch == result.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result += ch;
            }
        }
        System.out.println("After removing duplactes : " + result);

    }

}
