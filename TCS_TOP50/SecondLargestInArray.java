package TCS_TOP50;

public class SecondLargestInArray {

    public static void main(String[] args) {

        int[] arr = { 10, 20, 4, 45, 99 };
        int n = arr.length;

        // 1st pass: find largest
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // 2nd pass: find second largest
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] != largest && arr[i] > second) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No 2nd largest element exists.");
        } else {
            System.out.println("Second largest element is: " + second);
        }
    }
}