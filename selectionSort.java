import java.util.Scanner;

public class selectionSort {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int smalest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smalest] > arr[j]) {
                    smalest = j;
                }
            }
            int temp = arr[smalest];
            arr[smalest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}
