package ARRAY_I;

public class PrintSubarray {

    public static void printSubarray(int arr[]) {
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray = " + ts);
        System.out.println("MaxSum of SubArray = " + maxSum);
        System.out.println("MinSum of SubArray = " + minSum);
    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 8, 10 };
        printSubarray(arr);
    }
}
