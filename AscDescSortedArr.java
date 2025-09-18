import java.util.Scanner;

public class AscDescSortedArr {

    // Function to check if array is sorted in ascending order
    public static boolean isSortedAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // As soon as it's not in order, return false
            }
        }
        return true; // loop completes, array is sorted
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Call the function
        if (isSortedAscending(numbers)) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }

        sc.close();
    }
}
