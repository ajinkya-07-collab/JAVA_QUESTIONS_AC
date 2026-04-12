package TCS_TOP50;

import java.util.Scanner;

public class FreqOfElementInArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[n]; // track counted elements

        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // mark as counted
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }

        sc.close();
    }
}
