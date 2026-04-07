package Basic_Sorting_Algorithms;

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            boolean swaped = false; // checkednid swap happens or not

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaped = true;
                }
            }
            if (swaped == false) {
                break;
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();

    }
}
