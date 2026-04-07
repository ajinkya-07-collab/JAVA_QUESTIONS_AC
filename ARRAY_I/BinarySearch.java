package ARRAY_I;

public class BinarySearch {

    public static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) { // right
                start = mid + 1;

            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
        int target = 10;

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Index of Target is = " + index);
        } else {
            System.out.println("Key NOT FOUND");
        }

    }
}
