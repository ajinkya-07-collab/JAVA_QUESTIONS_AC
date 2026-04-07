import java.util.Scanner;

public class bubbleSort {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size :");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter Array Elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // bubblesort timecomplexity = O(n^2) --not good
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j]; // arr[j] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j + 1]; // arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = temp; // arr[j] = arr[j] ^ arr[j + 1];

                }
            }
        }
        printArray(arr);

    }

}
