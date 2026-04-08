package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class LaptopCharge {

    public static int laptopCount(int arr[], int minCharge) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > minCharge) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // String line = sc.nextLine();

        String line = "23671";
        String[] parts = line.split("");
        int[] arr = new int[parts.length];

        int minCharge = 5;

        for (int i = 0; i < parts.length; i++) {
            // arr[i] = line.charAt(i) - '0';
            arr[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(laptopCount(arr, minCharge));

    }

}
